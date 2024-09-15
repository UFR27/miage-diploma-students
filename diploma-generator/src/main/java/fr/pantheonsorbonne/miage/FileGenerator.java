package fr.pantheonsorbonne.miage;

/**
 * an object able to be serialized as a File
 * 
 * @author nherbaut
 *
 */
public abstract class FileGenerator<G extends DiplomaGenerator> {

	protected final G generator;

	protected FileGenerator(G g) {
		this.generator = g;
	}

	public abstract void generateFile(String outputFile);
}
