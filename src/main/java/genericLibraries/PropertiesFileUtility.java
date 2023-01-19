package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * This class contains reusable methods related to actions performed
 * @author KALYAN
 * @param path 
 *
 */
public class PropertiesFileUtility {
	public void propertyFileInitialization(String path) {
		FileInputStream fos= null;
		try {
			fos = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}


