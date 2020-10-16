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
	 * @throws FailedGenerateException 
	 * @throws FailedGenerateException 
	 * @throws FailedGenerateDocException 
	 */
	InputStream getContent() throws FailedGenerateException, FailedGenerateException, FailedGenerateDocException;

}