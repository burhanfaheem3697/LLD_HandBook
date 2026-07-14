import java.util.*;

public class IndexPlayground {
    public static void main(String[] args) {
        int arr[] = new int[5];

        for(int i=0;i<5;i++){
            arr[i] = i;
        }

        List<Integer> list = new ArrayList<>(5);

        for(int i=0;i<5;i++){
            list.add(i);
        }

        try {
            System.out.println("Printing the out of bound index : " + arr[23]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("here I catch the exception for the primitive array : " + e.getClass().getSimpleName());
        }

        try {
            System.out.println("Printing the out of bound index : " + list.get(5));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("here I catch the exception for the arraylist : " + e.getClass().getSimpleName());
        }


    }
}