package fr.pantheonsorbonne.miage;

/**
 * an object able to be serialized as a File
 * 
 * @author nherbaut
 *
 */
public abstract class FileGenerator<A extends DiplomaGenerator> {

	protected final A generator;

	public FileGenerator(A t) {
		this.generator = t;
	}

	public abstract void generateFile(String outputFile) throws FailedWriteException, FailedGenerateException;
}
