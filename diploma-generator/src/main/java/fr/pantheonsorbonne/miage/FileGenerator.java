package fr.pantheonsorbonne.miage;

/**
 * an object able to be serialized as a File
 * 
 * @author nherbaut
 *
 */
public abstract class FileGenerator<G9 extends DiplomaGenerator> {

	protected final G9 generator;

	public FileGenerator(G9 t) {
		this.generator = t;
	}

	public abstract void generateFile(String outputFile);
}
