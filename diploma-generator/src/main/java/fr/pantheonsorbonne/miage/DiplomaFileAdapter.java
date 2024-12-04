package fr.pantheonsorbonne.miage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import com.google.common.io.ByteStreams;

public class DiplomaFileAdapter extends FileGenerator<AbstractDiplomaGenerator> {
	

	public DiplomaFileAdapter(AbstractDiplomaGenerator generator) {
		super(generator);

	}
	
	public static class DomainException extends RuntimeException {
		public DomainException(String msg, Throwable cause) {
			super(msg, cause);
		}
		
	}

	
	@Override
	public void generateFile(String outputFile) {
		try (FileOutputStream fos = new FileOutputStream(outputFile)) {
			InputStream is = this.generator.getContent();
			ByteStreams.copy(is, fos);
			is.close();
		} catch (IOException e) {
			throw new DomainException("failed to write diploma file", e);
		}
	}

}
