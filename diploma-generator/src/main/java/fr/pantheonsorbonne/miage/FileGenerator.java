package fr.pantheonsorbonne.miage;

/**
 * an object able to be serialized as a File
 * 
 * @author nherbaut
 *
 */
public abstract class FileGenerator<Generator extends DiplomaGenerator> {

	protected final Generator generator;

	 FileGenerator(Generator t) {
		this.generator = t;
	}

	public abstract void generateFile(String outputFile);
}
