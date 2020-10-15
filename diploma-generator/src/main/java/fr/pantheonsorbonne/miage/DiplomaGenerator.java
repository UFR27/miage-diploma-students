package fr.pantheonsorbonne.miage;

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
	 * @throws failedToGenerateException 
	 * @throws FailedToGenerateDocException 
	 * @throws FailedToGenerateException 
	 */
	InputStream getContent() throws FailedToGenerateException, FailedToGenerateDocException;

}