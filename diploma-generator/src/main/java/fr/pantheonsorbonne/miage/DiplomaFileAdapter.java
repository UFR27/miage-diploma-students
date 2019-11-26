package fr.pantheonsorbonne.miage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

import com.google.common.io.ByteStreams;



public class DiplomaFileAdapter extends FileGenerator<AbstractDiplomaGenerator> {

	public DiplomaFileAdapter(AbstractDiplomaGenerator generator) {
		super(generator);

	}

	@Override
<<<<<<< HEAD
<<<<<<< HEAD
	public void generateFile(String outputFile) throws GenerationFailedException, WritingException {
=======
	public void generateFile(String outputFile) throws GenerateFileException, WrittingInFileException {
>>>>>>> webapp
=======
	public void generateFile(String outputFile) throws GenerationFailedException, WritingException {
>>>>>>> 0840c9fd57eedb1f9867fc2beb8740d8ad33d288
		try (FileOutputStream fos = new FileOutputStream(outputFile)) {
			InputStream is = this.generator.getContent();
			ByteStreams.copy(is, fos);
			is.close();
		} catch (IOException e) {
			Logger.getLogger(e.getMessage());
<<<<<<< HEAD
<<<<<<< HEAD
			throw new WritingException("failed to write diploma file", e);
=======
			throw new WrittingInFileException("failed to write diploma file", e);
>>>>>>> webapp
=======
			throw new WritingException("failed to write diploma file", e);
>>>>>>> 0840c9fd57eedb1f9867fc2beb8740d8ad33d288
		}
	}

}
