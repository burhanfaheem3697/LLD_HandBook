
public class PassByValueTest {
    public static void main(String[] args) {
        int x = 5;
        modifyPrimitive(x);
        System.out.println(x);
        StringBuilder sb = new StringBuilder("Hello world");
        modifyReference(sb);
        System.out.println(sb);
        float b = 3.0;
    }

    private static void modifyPrimitive(int x){
        x++;
    }

    private static void modifyReference(StringBuilder sb){
        sb.append(" modified");
        sb = new StringBuilder("new string assigned");
    }
}
