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
	 * @throws FailedFileStreamException 
<<<<<<< HEAD
	 */
	InputStream getContent() throws FailedFileStreamException;
=======
	 * @throws FailedGenerateException 
	 */
	InputStream getContent() throws FailedFileStreamException, FailedGenerateException;
>>>>>>> encryption

}