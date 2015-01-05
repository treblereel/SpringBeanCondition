package org.treblereel.spring.beancondition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by chani on 1/5/15.
 */
public class Utils {
    private static final Logger LOG = LoggerFactory.getLogger(Utils.class);
    private static Properties prop = new Properties();

    static{
        try {
            prop.load(ClassLoader.getSystemResourceAsStream("config.properties"));
        } catch (IOException  e) {
            LOG.error(e.getMessage());
        }
    }

    public static String getPropertyValue(String key){
            return prop.getProperty(key);
    }

}
