package fr.pantheonsorbonne.miage;

import java.io.InputStream;

import com.itextpdf.text.DocumentException;

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
	 * @throws DocumentException 
	 */
	InputStream getContent();

}