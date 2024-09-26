package fr.pantheonsorbonne.miage;

/**
 * an object able to be serialized as a File
 * 
 * @author nherbaut
 *
 */
public abstract class FileGenerator<Gen extends DiplomaGenerator> {

	protected final Gen generator;

	public FileGenerator(Gen t) {
		this.generator = t;
	}

	public abstract void generateFile(String outputFile);
}
