package fr.pantheonsorbonne.miage;

import java.io.InputStream;

/**
 * a diploma generator for the MIAGE section
 * 
 * @author nherbaut
 *
 */
public interface DiplomaGenerator {

	/**
	 * Generate the diploma in a Stream
	 * 
	 * @return
	 */
	InputStream getContent() throws DiplomaNotGeneratedException;
}