package fr.pantheonsorbonne.miage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import com.google.common.io.ByteStreams;
import com.itextpdf.text.log.LoggerFactory;


public class DiplomaFileAdapter extends FileGenerator<AbstractDiplomaGenerator> {

	protected final com.itextpdf.text.log.Logger logger=LoggerFactory.getLogger(getClass());
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
			logger.error("" + e);
			throw new FailWriteDiplomaException("failed to write diploma file", e);
		}
	}

}
