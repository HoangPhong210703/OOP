package OOP.Lab01;
import java.util.Arrays;


public class SortArray {
    
    public static void main(String[] arg){

        int[] arr = {1234, 9999, 1, 2, 3, 4, 5, 1000, -9999, 0};
        int[] copy = arr;
        int sum = 0;

        Arrays.sort(copy);

        for(int num : arr){
            sum += num;
        }

        double average = (double) sum / arr.length;


        System.out.println(Arrays.toString(copy));
        System.out.println(sum);
        System.out.println(average);


    }



    
}
