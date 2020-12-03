package fr.pantheonsorbonne.miage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


import com.google.common.io.ByteStreams;



public class DiplomaFileAdapter extends FileGenerator<AbstractDiplomaGenerator> {

	private static final String LOGGER = null;

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
			 log(String ("write diploma"), e);
			throw new RuntimeException("failed to write diploma file", e);
		}
	}

	private void log(Object string, IOException e) {
		// TODO Auto-generated method stub
		
	}

	private Object String(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
