//import java.util.*;
//
//public class swap {
//    public static void main(String[] args) {
//        int arr[] = {1,3,4,6,8};
//        swap(arr, 1, 3);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void swap(int[] arr, int index1, int index2){
//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;
//
//    }
//
//
//    // same code by taking user input
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the size of the array: ");
//        int size = scn.nextInt();    // get input from user the size of the array.
//        System.out.println("Enter the array elements: ");
//        int[] numbers = new int[size];  // creates a new integer array of size given by user.
//        // for taking input
//        for (int i = 0; i < size; i++) {
//            numbers[i] = scn.nextInt();
//        }
////         for printing the array
//        for (int i = 0; i < size; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//
//        swap(numbers, 1,2);
//        System.out.println("After Swapping: ");
//        System.out.println(Arrays.toString(numbers));
//
//    }
//
//    static void swap(int[] arr, int index1, int index2){
//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;
//    }
//
//}
