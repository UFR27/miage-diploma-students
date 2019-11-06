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
	public void generateFile(String outputFile) {
		try (FileOutputStream fos = new FileOutputStream(outputFile)) {
			InputStream is = this.generator.getContent();
			ByteStreams.copy(is, fos);
			is.close();
		} catch (IOException e) {
			Logger.getGlobal().info("IO PB" + e.getMessage());
			try {
				throw new FileWrittingException("failed to write diploma file", e);
			} catch (FileWrittingException e1) {
				Logger.getGlobal().info("IO PB" + e1.getMessage());
			}
		}
	}

}
