package fr.pantheonsorbonne.miage;

/**
 * an object able to be serialized as a File
 * 
 * @author nherbaut
 *
 */
public abstract class FileGenerator<S extends DiplomaGenerator> {

	protected final S generator;

	public FileGenerator(S t) {
		this.generator = t;
	}

	public abstract void generateFile(String outputFile) throws FailedException;
}
