package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		File file = new File("./src/test/resources/config.properties");
		FileInputStream fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("buildVersion"));
		System.out.println(prop.getProperty("Env"));
		prop.setProperty("buildVersion", "18.45");
		System.out.println(prop.getProperty("buildVersion"));
		

	}

}
