package fr.pantheonsorbonne.miage;

/**
 * an object able to be serialized as a File
 * 
 * @author nherbaut
 *
 */
public abstract class FileGenerator<G2 extends DiplomaGenerator> {

	protected final G2 generator;

	protected FileGenerator(G2 t) {
		this.generator = t;
	}

	public abstract void generateFile(String outputFile);
}
