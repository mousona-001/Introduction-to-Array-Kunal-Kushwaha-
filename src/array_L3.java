import java.util.Arrays;
import java.util.Scanner;

public class array_L3 {
    public static void main(String[] args) {
//        int[] num = {3,4,1,6};
//        System.out.println(Arrays.toString(num));
//        change(num);
//        System.out.println(Arrays.toString(num));
        Scanner scn = new Scanner(System.in);

        int arr[][] = new int[3][3];
        System.out.println(arr.length);    // no. of rows

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = scn.nextInt();
            }
        }
//            for (int row = 0; row < arr.length; row++) {
//                for (int col = 0; col < arr[row].length; col++) {
//                    System.out.print(arr[row][col]);
//                }
                // or we can write:
//                System.out.println(Arrays.toString(arr[row]));

                // or we can also write:
                for(int[] a : arr){
                    System.out.println(Arrays.toString(a));

            }
    }
}
//    static void change(int[]arr){
//        arr[0] = 90;
//    }
