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
	 * @throws GenerateDocumentException 
	 * @throws DiplomaGenerationException 
	 * @throws GenerateFileException 
	 */
	InputStream getContent() throws DiplomaGenerationException, GenerateDocumentException, GenerateFileException;

}