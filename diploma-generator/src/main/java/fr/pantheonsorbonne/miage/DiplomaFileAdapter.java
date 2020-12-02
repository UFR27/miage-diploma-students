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
<<<<<<< HEAD
	public void generateFile(String outputFile) throws WriteDiplomaException, DiplomaGenerationException, GenerateDocumentException, GenerateFileException {
=======
	public void generateFile(String outputFile) throws DiplomaGenerationException, DocumentGenerationException, WriteDiplomaFileException {
>>>>>>> master
		try (FileOutputStream fos = new FileOutputStream(outputFile)) {
			InputStream is = this.generator.getContent();
			ByteStreams.copy(is, fos);
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
<<<<<<< HEAD
			throw new WriteDiplomaException("failed to write diploma file", e);
=======
			throw new WriteDiplomaFileException("failed to write diploma file", e);
>>>>>>> master
		}
	}

}
