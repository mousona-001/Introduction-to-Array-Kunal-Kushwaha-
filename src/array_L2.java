import java.util.Arrays;
import java.util.Scanner;

public class array_L2 {
    public static void main(String[] args) {

        // array of primitives :
//        int arr[] = new int[5];
//        Scanner scn = new Scanner(System.in);
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = scn.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));  // for printing the array elements.

        // or we can also write
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

        // array of objects :
//        String[] str = new String[4];
//        for(int i = 0; i < str.length; i++){
//            str[i] = scn.next();
//        }
//        System.out.println(Arrays.toString(str));
//
//        // modify
//        str[1] = "mou";
//        System.out.println(Arrays.toString(str));

        // also can write.
//        int arr[] = {1,2,3,4};
//        for(int i=0; i<4; i++){
//            System.out.println(arr[i]);
//        }

        // user input size + array elements :
        System.out.println("Enter the size of the array: ");
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        System.out.println("Enter the array elements: ");
        int numbers[] = new int[size];

        //input
        for(int i=0; i<size; i++){
            numbers[i] = scn.nextInt();
        }

        //output
        for(int i = 0; i<size; i++){
            System.out.print(numbers[i] + " ");
        }



    }
}
