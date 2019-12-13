package fr.pantheonsorbonne.miage;

import java.util.logging.Logger;

/**
 * an object able to be serialized as a File
 * 
 * @author nherbaut
 *
 */
public abstract class FileGenerator<G> implements DiplomaGenerator {

	protected final G generator;
	protected final Logger log;

	public FileGenerator(G t) {
		this.log = null;
		this.generator = t;
	}

	public abstract void generateFile(String outputFile);
}
