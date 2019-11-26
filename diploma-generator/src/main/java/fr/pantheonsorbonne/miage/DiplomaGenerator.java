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
<<<<<<< HEAD
<<<<<<< HEAD
	 * @throws GenerationFailedException 
	 */
	InputStream getContent() throws GenerationFailedException;
=======
	 * @throws GenerateFileException 
	 */
	InputStream getContent() throws GenerateFileException;
>>>>>>> webapp
=======
	 * @throws GenerationFailedException 
	 */
	InputStream getContent() throws GenerationFailedException;
>>>>>>> 0840c9fd57eedb1f9867fc2beb8740d8ad33d288

}