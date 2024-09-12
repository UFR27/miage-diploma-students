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
	 * @throws FailedToGenerateException 
	 * @throws FailedEncryption 
	 */
	InputStream getContent() throws FailedToGenerateException, FailedEncryption;

}