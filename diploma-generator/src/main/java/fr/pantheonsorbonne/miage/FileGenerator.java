package fr.pantheonsorbonne.miage;

/**
 * an object able to be serialized as a File
 * 
 * @author nherbaut
 *
 */
public abstract class FileGenerator<G1 extends DiplomaGenerator> {

	protected final G1 generator;

	protected FileGenerator(G1 t) {
		this.generator = t;
	}

	public abstract void generateFile(String outputFile);
}
