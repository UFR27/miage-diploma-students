package fr.pantheonsorbonne.miage;

/**
 * an object able to be serialized as a File
 * 
 * @author nherbaut
 *
 */
public abstract class FileGenerator<GE extends DiplomaGenerator> {

	protected final GE generator;

	protected FileGenerator(GE t) {
		this.generator = t;
	}

	public abstract void generateFile(String outputFile) throws GenerateFail;
}
