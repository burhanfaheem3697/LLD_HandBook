
public class AppTester {
    public static void main(String[] args) {
        Config config = new Config();
        String str = config.print();
        assert str.equals("hello ksdffrom config!!!") : "Not Equal!!!";
    }
}