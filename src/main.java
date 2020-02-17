public class main {
    public static void main(String[] args) {
        int[] arr = {4,12,7,8,1,6,9};
        System.out.println("Min value in array is: " +arr[minValue(arr)]);
    }

    public static int minValue(int[] array) {
        int min = 0;
        for (int i=1; i < array.length; i++) {
            if (array[min] > array[i]){
                min = i;
            }
        }
        return min;
    }
}
