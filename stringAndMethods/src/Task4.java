public class Task4 {
    public static void main(String[] args) {
        //              0  1  2  3  4  5  6   7
        int[] values = {1, 2, 0, 5, 6, 4, 10, 3};
        System.out.println(findMinIndex(values));
        System.out.println(findMaxIndex(values));
        System.out.println(calculateSum(values));
    }
public static int calculateSum(int[] values) {
    int minIndex = findMinIndex(values);
    int maxIndex = findMaxIndex(values);
    int result = 0;
    for (int i = minIndex + 1; i < maxIndex; i++) {
        result += values[i];
    }
return result;
}


    public static int findMinIndex(int[] values) {
        int minIndex = 0;
        int minValue  = values[minIndex];
        for (int i = 0; i < values.length ; i++) {
            if(minValue>values[i]){
                minValue=values[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int findMaxIndex(int[] values){
        int maxIndex = 0;
        int maxValue  = values[maxIndex];
        for (int i = 0; i <values.length ; i++) {
            if(maxValue<values[i]){
                maxValue=values[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
