class June10 {
    public static boolean fillSum(int maxValArr, int index, int maxSum, int n) {
        int arr[] = new int[n];
        arr[index] = maxValArr;
        int sum = 0;
        for (int i = index - 1; i > -1; i--) {
            arr[i] = arr[i + 1] - 1;
            if (arr[i] <= 0) {
                arr[i] = 1;
            }
            sum += arr[i];
        }
        for (int i = index + 1; i < n; i++) {
            arr[i] = arr[i - 1] - 1;
            if (arr[i] <= 0) {
                arr[i] = 1;
            }
            sum += arr[i];
        }
        return sum < maxSum;
    }

    public static int maxValue(int n, int index, int maxSum) {
        
        int maxValArr = 
        if (!fillSum(n, index, maxSum, index)) {
        }
    }

    public static void main(String[] args) {

    }
}