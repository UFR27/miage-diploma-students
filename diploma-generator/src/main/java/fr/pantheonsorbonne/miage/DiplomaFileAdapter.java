package fr.pantheonsorbonne.miage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

import com.google.common.io.ByteStreams;
import com.itextpdf.text.log.Level;



public class DiplomaFileAdapter extends FileGenerator<AbstractDiplomaGenerator> {
	private static final Logger Log = Logger.getLogger(
		    Thread.currentThread().getStackTrace()[0].getClassName() );
	public DiplomaFileAdapter(AbstractDiplomaGenerator generator) {
		super(generator);

	}

	@Override
	public void generateFile(String outputFile) {
		Log.setLevel(Level.ERROR);
		try (FileOutputStream fos = new FileOutputStream(outputFile)) {
			InputStream is = this.generator.getContent();
			ByteStreams.copy(is, fos);
			is.close();
		} catch (IOException e) {
			Log.error(e.getStackTrace());
			throw new IllegalArgumentException("failed to write diploma file", e);
		}
	}

}
