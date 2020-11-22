package fr.pantheonsorbonne.miage;

/**
 * This decorator pattern allow you to encrypt whatever DiplomaGenerator by providing a password.
 * to use it, simply replace
 * DiplomaGenerator generator = new MiageDiplomaGenerator(...);
 * by
 * EncryptedDiplomaGeneratorDecorator generator = new EncryptedDiplomaGeneratorDecorator(new MiageDiplomaGenerator(...)); 
 * @author nherbaut
 *
 */

public abstract class DiplomaGeneratorDecorator extends AbstractDiplomaGenerator {

	protected DiplomaGenerator other;

	public DiplomaGeneratorDecorator(DiplomaGenerator other) {
		this.other = other;
	}

}
