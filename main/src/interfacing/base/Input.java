package interfacing.base;

public interface Input extends Interface {
	/**
	 * Reads bytes from this interface, returns available data, if none will wait if Wait true until new data is available.
	 * @return The bytes input.
	 */
	public abstract byte[] inBytes();
	/**
	 * Reads bytes from this interface, returns available data, if none will wait if Wait true until new data is available.
	 * @return The String input.
	 */
	public abstract String inString();
}
