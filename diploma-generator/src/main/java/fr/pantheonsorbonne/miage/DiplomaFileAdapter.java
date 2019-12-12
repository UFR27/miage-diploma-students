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
     
	
	public void generateFile1(String outputFile) throws NoFilegeneratedException, NoDocumentGeneratedException, DiplomaFileWrittingException {
		try (FileOutputStream fos = new FileOutputStream(outputFile)) {
			InputStream is = this.generator.getContent();
			ByteStreams.copy(is, fos);
			is.close();
		} catch (IOException e) {
			throw new DiplomaFileWrittingException("failed to write diploma file", e);
		}
	}
	
	@Override
	public void generateFile(String outputFile) {
		try {
			generateFile1(outputFile);
		} catch (Exception e) {
			logger.log(Level.INFO,"The exception is: "+ e.getMessage());
		}
	}

}
