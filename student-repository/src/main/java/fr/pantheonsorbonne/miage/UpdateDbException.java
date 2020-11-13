package fr.pantheonsorbonne.miage;

public class UpdateDbException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public UpdateDbException(String desc) {
		super(desc);
	}
}
