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
<<<<<<< HEAD
<<<<<<< HEAD
	public void generateFile(String outputFile) throws WriteException, GenerateFileException {
=======
	public void generateFile(String outputFile) throws GenerateFileException, GeneratorDocumentException, WriteFileException {
>>>>>>> master
=======
	public void generateFile(String outputFile) throws GenerateFileException, GeneratorDocumentException, WriteFileException {
>>>>>>> master
		try (FileOutputStream fos = new FileOutputStream(outputFile)) {
			InputStream is = this.generator.getContent();
			ByteStreams.copy(is, fos);
			is.close();
		} catch (IOException e) {
			
<<<<<<< HEAD
<<<<<<< HEAD
			throw new WriteException();
=======
			throw new WriteFileException();
>>>>>>> master
=======
			throw new WriteFileException();
>>>>>>> master
		}
	}

}
