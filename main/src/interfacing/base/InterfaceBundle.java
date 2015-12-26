package interfacing.base;

public interface InterfaceBundle {
	//Identification Methods
	/**
	 * Gets the name of this InterfaceBundle, must not change between versions.
	 * @return A String representing the identifier of this interface bundle.
	 */
	public abstract String getName();
	/**
	 * Gets any additional identifiers for this InterfaceBundle. This allows for things like identifying it as Alpha, dev version, etc... while still having a name of the actual set.
	 * @return A string representing any additional identifiers of the InterfaceBundle.
	 */
	public abstract String getIdentifiers();
	/**
	 * Gets the version of the Interface Bundle. Structure is undefined but must increase with later versions.
	 * @return An int representing the version of the interface.
	 */
	public abstract int getVersion();
	
	//Children Methods
	/**
	 * Gets the class of its Input computer interface.
	 * @return Null if nonexistent.
	 */
	public abstract Class<Input> getInputClass();
	/**
	 * Gets the class of its Output computer interface.
	 * @return Null if nonexistent.
	 */
	public abstract Class<Output> getOutputClass();
}
