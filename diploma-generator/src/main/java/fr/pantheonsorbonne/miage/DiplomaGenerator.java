package fr.pantheonsorbonne.miage;

import java.io.IOException;
import java.io.InputStream;

/**
 * a Diploma generator for the MIAGE section
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
	InputStream getContent() throws IOException;

}