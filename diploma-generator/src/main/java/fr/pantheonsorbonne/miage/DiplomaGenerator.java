package fr.pantheonsorbonne.miage;

import java.io.InputStream;
import java.util.concurrent.ExecutionException;

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
	 * @throws ExecutionException 
	 */
	InputStream getContent() throws ExecutionException;

}