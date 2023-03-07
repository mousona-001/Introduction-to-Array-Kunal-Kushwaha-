public class Main {

    // in java primitives are stored in stack memory. But objects are stored in heap memory.
    // Primitives are : int, char, float, boolean. Non-primitives are : string, array.
    public static void main(String[] args) {
        // Syntax
        // datatype[] variable_name = new_datatype[size]
//        int[] rnos = new int[5];
//        // or directly
//        int[] rnos2 = {1,2,3,4,5};

        // int[] : represents what is the type of data stored inside this array.
        // all the type of data in the array should be same.

        int[] ros;  // declaration of array. ros is getting defined in the stack.
        ros = new int[5];  // initialization: actually here object is being created in the heap memory.

        // array objects are in heap.
        // heap objects are not continuous.
        // new is used to create an object.



    }
}