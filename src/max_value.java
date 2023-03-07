public class max_value {
    public static void main(String[] args) {
        int arr[] = {1,3,4,6,8};
        System.out.println(maxRange(arr, 1 , 3));
    }

    // maximum range :
    static int maxRange(int[] arr, int start, int end){
        int maxVal = arr[start];
        for (int i = start; i < end; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }

        }
        return maxVal;
    }

    // maximum value:
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }

        }
        return maxVal;
    }

}
