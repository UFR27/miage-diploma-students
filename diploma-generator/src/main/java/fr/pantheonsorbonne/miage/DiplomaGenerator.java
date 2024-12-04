package fr.pantheonsorbonne.miage;

import java.io.InputStream;

import javax.annotation.processing.FilerException;

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
	 * @throws FilerException 
	 */
	InputStream getContent() throws FilerException ;

}