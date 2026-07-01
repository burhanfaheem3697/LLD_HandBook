

public class Application {
    public static void main(String[] args) {
        Config config = new Config();
        String word = config.read();

        System.out.println(word);
    }
}