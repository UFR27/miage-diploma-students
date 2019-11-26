package fr.pantheonsorbonne.miage;

/**
 * an object able to be serialized as a File
 * 
 * @author nherbaut
 *
 */
public abstract class FileGenerator<G extends DiplomaGenerator> {

	protected final G generator;

	public FileGenerator(G t) {
		this.generator = t;
	}

<<<<<<< HEAD
<<<<<<< HEAD
	public abstract void generateFile(String outputFile) throws GenerationFailedException, WritingException;
=======
	public abstract void generateFile(String outputFile) throws GenerateFileException, WrittingInFileException;
>>>>>>> webapp
=======
	public abstract void generateFile(String outputFile) throws GenerationFailedException, WritingException;
>>>>>>> 0840c9fd57eedb1f9867fc2beb8740d8ad33d288
}
