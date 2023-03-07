import java.util.Scanner;

public class array_2D {
    public static void main(String[] args) {

        // Declaration : int arr_name[][] = new int[rows][columns]
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the number of rows: ");
//        int rows = scn.nextByte();
//        System.out.println("Enter the number of columns: ");
//        int cols = scn.nextInt();
//
//        int[][] numbers = new int[rows][cols];
//        System.out.println("Enter the array elements: ");
//        for(int i = 0; i < rows; i++){
//            for(int j = 0; j < cols; j++){
//                numbers[i][j] = scn.nextInt();
//            }
//        }
//        for(int i = 0; i < rows; i++){
//            for(int j = 0; j < cols; j++){
//                System.out.print(numbers[i][j] + " ");
//            }
//            System.out.println();
//        }

        // Q. Take a matrix as input from the user. Search for a given number 'x' and print the indices at which it occurs.
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the number of rows: ");
//        int rows = scn.nextInt();
//        System.out.println("Enter the number of columns: ");
//        int cols = scn.nextInt();
//
//        int[][] numbers = new int[rows][cols] ;
//        System.out.println("Enter the array elements: ");
//        for(int i = 0; i<rows; i++){
//            for(int j = 0; j<cols; j++){
//                numbers[i][j] = scn.nextInt();
//            }
//        }
//        for(int i = 0; i < rows; i++){
//            for(int j = 0; j < cols; j++){
//                System.out.print(numbers[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("Enter the number you want to check: ");
//        int x = scn.nextInt();
//        for(int i = 0; i< numbers.length; i++){
//            for(int j = 0; j< numbers.length; j++){
//                if(numbers[i][j] == x){
//                    System.out.println("Number is found at index " + i+ "," +j);
//                }

        int[][] arr = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };
        for (int row= 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + ",");
            }
            System.out.println();
        }

            }
        }
