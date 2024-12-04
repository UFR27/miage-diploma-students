package fr.pantheonsorbonne.miage;

import java.io.InputStream;

import fr.pantheonsorbonne.miage.exception.FailedGeneratingEncryptedFileException;

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
	 * @throws FailedGeneratingEncryptedFileException
	 */
	InputStream getContent() throws FailedGeneratingEncryptedFileException;

}