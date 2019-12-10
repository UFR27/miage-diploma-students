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
	 * @throws FailInGenerateException 
	 * @throws FailInGenerateDocumentException 
	 */
	InputStream getContent() throws FailInGenerateException, FailInGenerateDocumentException;

}