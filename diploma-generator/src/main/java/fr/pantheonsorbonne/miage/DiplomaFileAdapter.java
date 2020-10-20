package fr.pantheonsorbonne.miage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

import com.google.common.io.ByteStreams;

import fr.pantheonsorbonne.miage.diploma.DiplomaSnippet;

public class DiplomaFileAdapter extends FileGenerator<AbstractDiplomaGenerator> {

	public DiplomaFileAdapter(AbstractDiplomaGenerator generator) {
		super(generator);

	}

	@Override
	public void generateFile(String outputFile) throws FailedWriteException, FailedFileStreamException {
		try (FileOutputStream fos = new FileOutputStream(outputFile)) {
			InputStream is = this.generator.getContent();
			ByteStreams.copy(is, fos);
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new FailedWriteException("failed to write diploma file", e);
		}
	}

}
