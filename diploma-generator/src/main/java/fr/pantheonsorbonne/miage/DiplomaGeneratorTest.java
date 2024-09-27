package fr.pantheonsorbonne.miage;



import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.tools.imageio.ImageIOUtil;
import com.google.common.io.ByteStreams;

public class DiplomaGeneratorTest {

	static protected Date currentDate;
	{
		try {
			currentDate = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse("11/23/2018 17:00:00");
		} catch (ParseException e) {
			throw new RuntimeException("failed to compute test date", e);
		}
	}

	void compareGeneratedDiploma() {

		try {

			Student stu = new Student(0, "Nicolas", "");

			File generatedFileTarget = generateDiplomaForStudent(stu, currentDate);

			// write the bytes of an image version of the generated pdf diploma in this
			// OutputStream
			ByteArrayOutputStream generatedImageData = new ByteArrayOutputStream();
			writePDFImageRasterBytes(generatedFileTarget, generatedImageData);

			// write the bytes of an image version of a reference diploma
			ByteArrayOutputStream referenceImageData = new ByteArrayOutputStream();
			writePDFImageRasterBytes(new File("src/test/resources/nicolas.pdf"), referenceImageData);

			// check that the content is the same
			assertArrayEquals(referenceImageData.toByteArray(), generatedImageData.toByteArray());
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	protected void assertArrayEquals(byte[] byteArray, byte[] byteArray2) {
		// TODO Auto-generated method stub
		
	}

	private void fail(String message) {
		// TODO Auto-generated method stub
		
	}

	protected void writePDFImageRasterBytes(File generatedFileTarget, OutputStream generatedImageData)
			throws IOException, FileNotFoundException {
		BufferedImage genetatedbim = new PDFRenderer()
				.renderImage(0);
		File generatedImage = Files.createTempFile("prefix_", ".bmp").toFile();
		System.out.println(generatedImage);
		ImageIOUtil.writeImage(genetatedbim, generatedImage.getPath(), 20);
		FileInputStream generatedImageReader = new FileInputStream(generatedImage);
		ByteStreams.copy(generatedImageReader, generatedImageData);
	}

	protected File generateDiplomaForStudent(Student stu, Date date) throws IOException, FileNotFoundException, FileUpdateWriteDiplomaException, FileUpdateException {
		ByteArrayOutputStream generatedFileContent = new ByteArrayOutputStream();
		File generatedFileTarget = Files.createTempFile("prefix_", "_suffic").toFile();
		MiageDiplomaGenerator generator = new MiageDiplomaGenerator(stu, date);
		new DiplomaFileAdapter(generator).generateFile(generatedFileTarget.getPath());
		FileInputStream generatedFileReader = new FileInputStream(generatedFileTarget);
		ByteStreams.copy(generatedFileReader, generatedFileContent);
		return generatedFileTarget;
	}

} 