package fr.pantheonsorbonne.miage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import com.google.common.io.ByteStreams;

public class DiplomaFileAdapter extends FileGenerator<AbstractDiplomaGenerator> {

	public DiplomaFileAdapter(AbstractDiplomaGenerator generator) {
		super(generator);

	}

	@Override
	public void generateFile(String outputFile) throws FailedToWriteException {
		try (FileOutputStream fos = new FileOutputStream(outputFile)) {
			InputStream is;
				
					is = this.generator.getContent();
				
				ByteStreams.copy(is, fos);
				is.close();
			} catch (FailedToGenerateException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
				throw new FailedToWriteException("failed to write diploma file");
}
	}
	}
	


