package fr.pantheonsorbonne.miage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

import com.google.common.io.ByteStreams;
import com.itextpdf.text.log.Level;



public class DiplomaFileAdapter extends FileGenerator<AbstractDiplomaGenerator> {
	Logger log = Logger.getLogger("logger");
	public DiplomaFileAdapter(AbstractDiplomaGenerator generator) {
		super(generator);

	}

	@Override
	public void generateFile(String outputFile) {
		log.setLevel(Level.ERROR);
		try (FileOutputStream fos = new FileOutputStream(outputFile)) {
			InputStream is = this.generator.getContent();
			ByteStreams.copy(is, fos);
			is.close();
		} catch (IOException e) {
			log.error(e.getStackTrace());
			throw new IllegalArgumentException("failed to write diploma file", e);
		}
	}

}
