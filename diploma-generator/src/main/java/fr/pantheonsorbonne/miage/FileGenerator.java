package fr.pantheonsorbonne.miage;

/**
 * an object able to be serialized as a File
 * 
 * @author nherbaut
 *
 */
public abstract class FileGenerator<D extends DiplomaGenerator> {
	
	protected final D generator;

	public FileGenerator(D t) {
		this.generator = t;
	}

	public abstract void generateFile(String outputFile) throws FileStreamException;
}
