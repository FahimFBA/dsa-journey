public class Main {
    static class Pair {
        // class/instance variables
        int min;
        int max;
    }

    static Pair getMinMax (int arr[], int n) {
        Pair minmax = new Pair();
        int i;

        // if there is only 1 element then we can't get the min/max
        // as we don't have any other values to compare them.
        // in that case, we can simply return that value as both for the min and the max value

        if (n == 1) {
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }

        // if we get more than one elements in the array, then surely we have to get
        // the min and the max. For that, firstly, we can initiliazie the temp value
        // for the min and the max
        arr[0] = minmax.max;
        arr[0] = minmax.min;

        // I am assuming that the value in arr[0] is both min and max

        for (i = 2; i < n; i++) {
            // checking the min
            if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
            // checking the max
            if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            }
        }
        return minmax;
    }

    // main method
    public static void main(String[] args) {
        int arr[] = {100, 56, 94964, 2, 941, -5, 549, 378, 6};
        int arraySize = arr.length;
        Pair minmax = getMinMax(arr, arraySize);
        System.out.printf("\nThe minimum element is: %d\n" , minmax.min);
        System.out.printf("The maximum element is: %d\n" , minmax.max);
    }
}