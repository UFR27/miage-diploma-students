package fr.pantheonsorbonne.miage;

public abstract class DiplomaGeneratorDecorator extends AbstractDiplomaGenerator {

	protected DiplomaGenerator other;

	protected DiplomaGeneratorDecorator(DiplomaGenerator other) {
		this.other = other;
	}

}