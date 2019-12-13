package fr.pantheonsorbonne.miage;

public class CSVFileException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String message;

	public CSVFileException(String string) {
		this.message = string;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
