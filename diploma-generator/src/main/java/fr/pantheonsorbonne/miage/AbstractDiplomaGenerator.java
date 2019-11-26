package fr.pantheonsorbonne.miage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.Collection;



import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;

import fr.pantheonsorbonne.miage.diploma.DiplomaSnippet;

public abstract class AbstractDiplomaGenerator implements DiplomaGenerator {


	public AbstractDiplomaGenerator() {
		super();
		

	}

	/**
	 * provides all the snippets used for the concrete diploma implementation
	 * 
	 * @return
	 */
<<<<<<< HEAD
<<<<<<< HEAD
	abstract Collection<DiplomaSnippet> getDiplomaSnippets();
=======
	protected abstract Collection<DiplomaSnippet> getDiplomaSnippets();
>>>>>>> webapp
=======
	abstract Collection<DiplomaSnippet> getDiplomaSnippets();
>>>>>>> 0840c9fd57eedb1f9867fc2beb8740d8ad33d288

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.pantheonsorbonne.miage.DiplomaGenerator#getContent()
	 */
	@Override
<<<<<<< HEAD
<<<<<<< HEAD
	public InputStream getContent() throws GenerationFailedException {
=======
	public InputStream getContent() throws GenerateFileException {
>>>>>>> webapp
=======
	public InputStream getContent() throws GenerationFailedException {
>>>>>>> 0840c9fd57eedb1f9867fc2beb8740d8ad33d288

		try (ByteArrayOutputStream bos = new ByteArrayOutputStream();) {

			this.writeToStream(bos);

			return new ByteArrayInputStream(bos.toByteArray());

		} catch (IOException e) {

<<<<<<< HEAD
<<<<<<< HEAD
			throw new GenerationFailedException("failed to generate the file to stream to", e);
=======
			throw new GenerateFileException("failed to generate the file to stream to", e);
>>>>>>> webapp
=======
			throw new GenerationFailedException("failed to generate the file to stream to", e);
>>>>>>> 0840c9fd57eedb1f9867fc2beb8740d8ad33d288
		}

	}

<<<<<<< HEAD
<<<<<<< HEAD
	protected void writeToStream(OutputStream os) throws GenerationFailedException {
=======
	protected void writeToStream(OutputStream os) throws GenerateFileException {
>>>>>>> webapp
=======
	protected void writeToStream(OutputStream os) throws GenerationFailedException {
>>>>>>> 0840c9fd57eedb1f9867fc2beb8740d8ad33d288
		Document document = new Document();
	
		try {

			Path image = new File("src/main/resources/diploma.png").toPath();
			Rectangle rect = new Rectangle(800f, 600f);
			document.setPageSize(rect);

			PdfWriter writer = PdfWriter.getInstance(document, os);
			document.open();

			for (DiplomaSnippet snippet : this.getDiplomaSnippets()) {
				snippet.write(writer);
			}

			document.add(Image.getInstance(image.toAbsolutePath().toString()));

		} catch (DocumentException | IOException e) {
<<<<<<< HEAD
<<<<<<< HEAD
			throw new GenerationFailedException("failed to generate Document", e);
=======
			throw new GenerateFileException("failed to generate Document", e);
>>>>>>> webapp
=======
			throw new GenerationFailedException("failed to generate Document", e);
>>>>>>> 0840c9fd57eedb1f9867fc2beb8740d8ad33d288
		} finally {
			document.close();
		}
	}

}