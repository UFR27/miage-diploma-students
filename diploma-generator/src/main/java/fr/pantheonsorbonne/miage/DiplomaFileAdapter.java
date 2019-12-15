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
	public void generateFile(String outputFile) throws FileUpdateWriteDiplomaException {
		try (FileOutputStream fos = new FileOutputStream(outputFile)) {
			InputStream is = this.generator.getContent();
			ByteStreams.copy(is, fos);
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new FileUpdateWriteDiplomaException("failed to write diploma file", e);
		}
	}

	@Override
	public void getContent() throws FileUpdateGenerateException, FileUpdateException {
		// TODO Auto-generated method stub
		
	}

}
