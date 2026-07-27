import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * WarmUpExercise
 */
public class WarmUpExercise {

    public static void main(String[] args){
        Properties props = new Properties();

        try(InputStream is = WarmUpExercise.class.getClassLoader().getResourceAsStream("config.properties")){
            if(is == null){
                System.err.println("Error : config.properties file not found on classpath!");
                return;
            }

            props.load(is);

            System.out.println("Config Loaded Successfully!");

            System.out.println("Print the hello value : " + props.getProperty("hello    "));
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}