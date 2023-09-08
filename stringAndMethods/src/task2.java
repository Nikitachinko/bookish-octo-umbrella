public class task2 {
    public static void main(String[] args) {
int[] values = new int[100];
fillArray(values);
Main.printArray(values);
    }

    public static void fillArray(int[] values) {
        int currentIndex = 0;

        for (int currentValue = 1; currentIndex < values.length; currentValue++) {
            if (currentValue % 13 == 0 || currentValue % 17 == 0) {
                values[currentIndex++] = currentValue;

            }
        }
    }
}
