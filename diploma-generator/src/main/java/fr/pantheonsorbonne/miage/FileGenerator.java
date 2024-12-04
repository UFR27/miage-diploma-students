package fr.pantheonsorbonne.miage;

/**
 * an object able to be serialized as a File
 * 
 * @author nherbaut
 *
 */
public abstract class FileGenerator<g1 extends DiplomaGenerator> {

	protected final g1 generator;

	public FileGenerator(g1 t) {
		this.generator = t;
	}

	public abstract void generateFile(String outputFile);
}
