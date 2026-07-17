
public class ScopePlayground {
    public static void main(String[] args) {
        int blockVal = 30;
        if(true){
            blockVal = 3;
        }

        System.out.println(blockVal);
    }
}