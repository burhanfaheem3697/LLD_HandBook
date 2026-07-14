
public class StringPerformance {
    public static void main(String[] args) {
        String str = "";

        long a = System.currentTimeMillis();

        for(int i=0;i<10000;i++){
            str+="abc";
        }

        long b = System.currentTimeMillis();

        System.out.println("Initial time : " + a);
        System.out.println("Final time : " + b);
        System.out.println("Elapsed time : " + (b-a));


        StringBuilder str1 = new StringBuilder("");

        long c = System.currentTimeMillis();

        for(int i=0;i<10000;i++){
            str1.append("abc");
        }

        long d = System.currentTimeMillis();

        System.out.println("Initial time for string builder : " + c);
        System.out.println("Final time for string builder : " + d);
        System.out.println("Elapsed time for string builder : " + (d-c));



    }
}