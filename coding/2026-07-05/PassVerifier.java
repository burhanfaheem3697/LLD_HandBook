

public class PassVerifier {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello I am the String inside main");

        updateValue(sb);

        assert sb == null : "Here is the proof that value is not updated to null"; 
    }

    private static void updateValue(StringBuilder sb){
        sb.append(" modified");

        sb = null;
    }
}