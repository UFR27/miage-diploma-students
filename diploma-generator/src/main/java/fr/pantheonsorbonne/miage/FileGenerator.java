package fr.pantheonsorbonne.miage;

/**
 * an object able to be serialized as a File
 * 
 * @author nherbaut
 *
 */
public abstract class FileGenerator<G extends DiplomaGenerator> {

	protected final G generator;

	protected FileGenerator(G t) {
		this.G = t;
	}

	public abstract void generateFile(String outputFile);
}
