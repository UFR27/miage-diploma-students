package fr.pantheonsorbonne.miage;

public abstract class FileGenerator<GENERATOR extends DiplomaGenerator> {

	protected final GENERATOR generator;

	public FileGenerator(GENERATOR t) {
		this.generator = t;
	}

	public abstract void generateFile(String outputFile);
}
