package fr.pantheonsorbonne.miage;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

class EncryptedDiplomaGeneratorTest extends DiplomaGeneratorTest {

    private final class EncryptedPdfReader extends PdfReader {
        private EncryptedPdfReader(String filename, String password) throws IOException {
            super(filename);
            this.password = password.getBytes();
        }

        public void setEncrypted(boolean encrypted) {
            this.encrypted = encrypted;
        }
    }

    @Test
    void testEncryptedPdfTest() throws IOException, DocumentException {

        Student stu = new Student(1, "Nicolas", "", "nico");
        DiplomaGenerator generator = new MiageDiplomaGenerator(stu, DiplomaGeneratorTest.currentDate);
        AbstractDiplomaGenerator encryptedGenerator = new EncryptedDiplomaGeneratorDecorator(generator, "abc");
        FileGenerator<AbstractDiplomaGenerator> adapter = new DiplomaFileAdapter(encryptedGenerator);

        // Generate the encrypted PDF file
        Path tempFileEncrypted = Files.createTempFile("prefix", ".pdf");
        adapter.generateFile(tempFileEncrypted.toString());

        // Decrypt the encrypted PDF file
        Path tempFileDecrypted = Files.createTempFile("prefix", ".pdf");
        decryptPdf(tempFileEncrypted.toFile(), tempFileDecrypted.toFile(), "abc");

        // Compare the decrypted PDF with the reference PDF
        ByteArrayOutputStream generatedImageData = new ByteArrayOutputStream();
        writePDFImageRasterBytes(tempFileDecrypted.toFile(), generatedImageData);

        ByteArrayOutputStream referenceImageData = new ByteArrayOutputStream();
        writePDFImageRasterBytes(new File("src/test/resources/nicolas.pdf"), referenceImageData);

        assertArrayEquals(referenceImageData.toByteArray(), generatedImageData.toByteArray());
    }

    private void decryptPdf(File encryptedFile, File decryptedFile, String password)
            throws IOException, DocumentException {
        PdfReader reader = new PdfReader(encryptedFile.getPath(), password.getBytes());
        PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(decryptedFile.getPath()));
        stamper.close();
        reader.close();
    }
}
