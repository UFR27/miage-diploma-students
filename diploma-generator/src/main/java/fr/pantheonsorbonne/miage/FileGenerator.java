package fr.pantheonsorbonne.miage;

/**
 * an object able to be serialized as a File
 * 
 * @author herbaut
 *
 */
public abstract class FileGenerator<GENERATOR> implements DiplomaGenerator {

	protected final GENERATOR generator;

	public FileGenerator(GENERATOR t) {
		this.generator = t;
	}


	public abstract void generateFile(String outputFile) throws FileUpdateWriteDiplomaException, FileUpdateException;
}
