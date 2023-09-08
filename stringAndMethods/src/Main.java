public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printArray(arr);
        printArrayForeach(arr);
    }
    public static void printArray(int[] arr) {
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printArrayForeach(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
