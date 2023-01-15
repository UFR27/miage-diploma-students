package fr.pantheonsorbonne.miage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import com.google.common.io.ByteStreams;

import fr.pantheonsorbonne.miage.exception.FailedWritingDiplomaException;
import fr.pantheonsorbonne.miage.exception.FailedGeneratingEncryptedFileException;



public class DiplomaFileAdapter extends FileGenerator<AbstractDiplomaGenerator> {

	public DiplomaFileAdapter(AbstractDiplomaGenerator generator) {
		super(generator);

	}

	@Override
	public void generateFile(String outputFile) throws FailedGeneratingEncryptedFileException {
		try (FileOutputStream fos = new FileOutputStream(outputFile)) {
			InputStream is = this.generator.getContent();
			ByteStreams.copy(is, fos);
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new FailedWritingDiplomaException("failed to write diploma file", e);
		}
	}

}
