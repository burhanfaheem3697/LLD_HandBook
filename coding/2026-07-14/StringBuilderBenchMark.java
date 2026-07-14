
public class StringBuilderBenchMark {
    public static void main(String[] args) {
        String str = "hello";

        long strStartTime = System.currentTimeMillis();

        for(int i=0;i<10000;i++){
            str+="abc";
        }

        long strEndTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder("hello");

        long sbStartTime = System.currentTimeMillis();

        for(int i=0;i<10000;i++){
            sb.append("abc");
        }

        long sbEndTime = System.currentTimeMillis();

        long strDuration = strEndTime - strStartTime;

        long sbDuration = sbEndTime - sbStartTime;

        System.out.println("==================PERFORMANCE ANALYSIS==================");
        System.out.println("String concatenation time : " + strDuration + "ms");
        System.out.println("StringBuilder Append time : " + sbDuration + "ms") ;

        if(sbDuration == 0){
            System.out.println("StringBuilder execution was near instantaneous (under 1ms)");
        } else {
            double ratio = (double) strDuration/sbDuration;
            System.out.printf("\nString builder was approximately %.2fx faster!!!\n",ratio);
        }
    }
}