package fr.pantheonsorbonne.miage;

/**
 * an object able to be serialized as a File
 * 
 * @author nherbaut
 *
 */
public abstract class FileGenerator<generator9 extends DiplomaGenerator> {

	protected final generator9 generator;

	public FileGenerator(generator9 t) {
		this.generator = t;
	}

	public abstract void generateFile(String outputFile);
}
