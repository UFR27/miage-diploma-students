/**
 * 
 */
package fr.pantheonsorbonne.miage;

/**
 * @author ii08346
 *
 */
@SuppressWarnings("serial")
public class MyOwnRuntimeException extends RuntimeException {

	/**
	 * 
	 */
	public MyOwnRuntimeException() {}

	/**
	 * @param message
	 */
	public MyOwnRuntimeException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public MyOwnRuntimeException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public MyOwnRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public MyOwnRuntimeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
