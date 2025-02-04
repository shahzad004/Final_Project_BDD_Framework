package config;

import enums.Environment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {


    public static final Properties properties = new Properties();
    public static final Logger logger = LogManager.getLogger(properties);

    // a static method that will load automatically when class object is made

    static{
        loadProperties();
    }



    // To Load Config properties
    private  static void loadProperties(){

        try {
            FileInputStream baseConfig = new FileInputStream("src/main/resources/config/config.properties");
            properties.load(baseConfig);
            baseConfig.close();




            // Now To load the property of env from config file here
            Environment env = Environment.valueOf(properties.getProperty("env").toUpperCase());
            // as currently we have two environment files available test and dev load these dynamically
            String envConfigpath = "src/main/resources/config/" + env.name().toLowerCase() + "-config.properties";

            FileInputStream envConfig = new FileInputStream(envConfigpath );
            properties.load(envConfig);
            envConfig.close();


            logger.info("Configuration file is loaded Successfully  for : " + env );



        } catch (IOException e) {


            logger.error("Configuration Files is not loaded");
            throw new RuntimeException("Configuration load Failed");
        }

    }


    public static String getProperty(String key){
        return properties.getProperty(key);
    }

    public static String getProperty(String key, String defaultValue ){
        return properties.getProperty(key,defaultValue);
    }

    public static Environment getEnvironmnet(){
        return Environment.valueOf(properties.getProperty("env").toUpperCase());
    }

    public static int getIntProperty(String key){
        return Integer.parseInt(properties.getProperty(key));
    }

    public static void main(String[] args) {



        System.out.println(getEnvironmnet());
        System.out.println(getProperty("browser"));
    }



}
