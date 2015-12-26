package interfacing.base;

import com.deb.lib.database.AttributesBuilder;

/**
 * Interface
 * @author David Boles
 * Default Settings:
 * Name: Type, Default: Description
 * 
 * Enabled: Boolean, true: if false any action methods return immediately without doing anything.
 * Wait: Boolean, false: if false any output methods return immediately after starting a new Thread to perform the output, any input methods return null if no new input is immediately available. If true they wait to return until their action is complete.
 * Byte_Representation: Integer, 0; Way to handle bytes (01100001 ASCII 'a' as example) - 0 cast ('a') - 1 represent ("zero one one zero zero...)
 */
public interface Interface {
	//Parent methods
	/**
	 * Get's the parent InterfaceBundle class.
	 * @return Its class, should not be null.
	 */
	public abstract Class<InterfaceBundle> getBundleClass();
	
	//Settings methods
	/**
	 * Gets a list of the special settings it uses.
	 * @return The name of the special settings it uses. Their name, type, and description should be specified by the javadoc of the implementation of this class.
	 */
	public abstract String[] getUsedSettings();
	/**
	 * Passes setting values to the interface. If setting is not included or is null it should not be changed (unless otherwise specified). Should support the default settings specified in the javadoc of the Interface class.
	 * @param settings An AttributeBuilder containing the settings that should be applied.
	 */
	public abstract void applySettings(AttributesBuilder settings);
	/**
	 * Gets all the settings of this interface. Should include only and entirely default settings (specified in the javadoc of the Interface class) and those from getUsedSettings(). Non should be null.
	 * @return An AttributeBuilder of the interface's settings.
	 */
	public abstract AttributesBuilder getSettings();
}
