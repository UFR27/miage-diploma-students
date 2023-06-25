package fr.pantheonsorbonne.miage;

import java.io.IOException;

/**
 * an object able to be serialized as a File
 * 
 * @author nherbaut
 *
 */
public abstract class FileGenerator<T> implements DiplomaGenerator {

	protected final T generator;

	public FileGenerator(T t) {
		this.generator = t;
	}

	public abstract void generateFile(String outputFile) throws IOException;
}