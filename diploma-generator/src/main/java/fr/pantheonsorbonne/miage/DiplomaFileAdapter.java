package fr.pantheonsorbonne.miage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.common.io.ByteStreams;

import fr.pantheonsorbonne.miage.diploma.DiplomaSnippet;

public class DiplomaFileAdapter extends FileGenerator<AbstractDiplomaGenerator> {

	public DiplomaFileAdapter(AbstractDiplomaGenerator generator) {
		super(generator);

	}

	@Override
	public void generateFile(String outputFile) {
		Logger logger = Logger.getLogger("logger");
		logger.isLoggable(Level.INFO, "Logger Test");
		try (FileOutputStream fos = new FileOutputStream(outputFile)) {
			InputStream is = this.generator.getContent();
			ByteStreams.copy(is, fos);
			is.close();
		} catch (IOException e) {
			logger.isLoggable(Level.SEVERE, e.getMessage())
			throw new StudentListException("failed to write diploma file",e);
		}
	}

}
