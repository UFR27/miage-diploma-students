package fr.pantheonsorbonne.miage;

import java.io.InputStream;
import java.util.Date;

/**
 * a Diploma generator for the MIAGE section
 * 
 * @author nherbaut
 *
 */
public interface DiplomaGenerator {

	Date currentDate = null;

    /**
	 * Generate the diploma in a Stream
	 * 
	 * @return
	 */
	InputStream getContent();

}