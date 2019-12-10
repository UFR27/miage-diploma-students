package fr.pantheonsorbonne.miage;

import java.io.FileOutputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.google.common.io.ByteStreams;



public class DiplomaFileAdapter extends FileGenerator<AbstractDiplomaGenerator> {
	Logger logger = Logger.getLogger("logger");
	public DiplomaFileAdapter(AbstractDiplomaGenerator generator) {
		super(generator);

	}

	public void firstGenerateFile(String outputFile) throws FailInGenerateException, FailInGenerateDocumentException, FailInWriteException {
		try (FileOutputStream fos = new FileOutputStream(outputFile)) {
			InputStream is = this.generator.getContent();
			ByteStreams.copy(is, fos);
			is.close();
		} catch (IOException e) {
			throw new FailInWriteException("failed to write diploma file");
		}
	}
	
	@Override
	public void generateFile(String outputFile) {
		try {
			firstGenerateFile(outputFile);
			
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage());
		}
	}

}
