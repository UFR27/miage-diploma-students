package fr.pantheonsorbonne.miage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.common.io.ByteStreams;


public class DiplomaFileAdapter extends FileGenerator<AbstractDiplomaGenerator> {
	
	private static final Logger LOGGER = Logger.getLogger(DiplomaFileAdapter.class.getName());
	
	public DiplomaFileAdapter(AbstractDiplomaGenerator generator) {
		super(generator);

	}

	@Override
	public void generateFile(String outputFile) {

		try (FileOutputStream fos = new FileOutputStream(outputFile)) {
			InputStream is = this.generator.getContent();
			ByteStreams.copy(is, fos);
			is.close();
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, e.toString(), e);
		}
	}

}
