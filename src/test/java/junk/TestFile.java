package junk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class TestFile {

    private static Logger logger = LoggerFactory.getLogger(TestFile.class);

    public static final String BASE_URL_PROD = "https://google.com/";
    public static final String BASE_URL_RC_HF = "https://google.com/";
    public static final String BASE_URL_DEV = "https://google.com/";

    private String url;

    @Test
    public void test() {
        if (isPROD()) {
            url = BASE_URL_PROD;
            logger.info(url);
        } else if (isDev()) {
            url = BASE_URL_DEV;
            logger.info(url);
        } else {
            url = BASE_URL_RC_HF;
            logger.info(url);
        }
    }

    public static boolean isPROD() {
        return getAirslateUrl().equals("https://airslate.com");
    }

    public static boolean isDev() {
        return getAirslateUrl().contains("-dev");
    }

    public static boolean isStage() {
        return getAirslateUrl().contains("-stage");
    }

    public static boolean isRC() {
        return getAirslateUrl().contains("-rc");
    }

    public static boolean isAU() {
        return getAirslateUrl().contains("-au");
    }

    public static boolean isHF() {
        return getAirslateUrl().contains("-hf");
    }

    public static String getAirslateUrl() {
        return getProperties().getProperty("mvn.airslate.url").trim().replaceAll("/$", "");
    }

    private static Properties getProperties() {
        Properties properties = new Properties();
        try (var fileInputStream = new FileInputStream(ClassLoader.getSystemResource("TestParameters.properties").getFile())) {
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            logger.debug("TestParameters.properties not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }

}
