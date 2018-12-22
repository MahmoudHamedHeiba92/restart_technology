package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class utility {

    public static String fetchdataProperty(String key) throws IOException {
        FileInputStream file = new FileInputStream("src/test/java/config/config.properties");
        Properties property = new Properties();
        property.load(file);
        return property.get(key).toString();
    }

    public static String fetchlocatorProperty(String key) throws IOException {
        FileInputStream file = new FileInputStream("src/test/java/config/element.properties");
        Properties property = new Properties();
        property.load(file);
        return property.get(key).toString();
    }
}
