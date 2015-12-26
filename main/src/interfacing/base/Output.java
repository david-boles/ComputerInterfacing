package interfacing.base;

public interface Output extends Interface {
	/**
	 * Writes bytes to this interface, if Wait true Thread sleeps until output is complete.
	 * @param out The bytes to output.
	 */
	public abstract void outBytes(byte[] out);
	/**
	 * Writes a String to this interface, if Wait true Thread sleeps until output is complete.
	 * @param out The String to output.
	 */
	public abstract void outString(String out);
}
