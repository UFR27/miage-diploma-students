package fr.pantheonsorbonne.miage;

/**
 * an object able to be serialized as a File
 * 
 * @author nherbaut
 *
 */
public abstract class FileGenerator<M extends DiplomaGenerator> {

	protected final M generator;

	public FileGenerator(M t) {
		this.generator = t;
	}

	public abstract void generateFile(String outputFile);
}
