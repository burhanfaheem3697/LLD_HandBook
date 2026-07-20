
public class WarmUpExercise {
    public static void main(String[] args) {
        try {
            System.out.println(parseInt("asdf"));
        } catch (NumberFormatException e) {
            System.out.println(-1);
        }

        // System.out.println(parseInt("93"));
    }

    private static int parseInt(String val){
        return Integer.parseInt(val);
    }
}