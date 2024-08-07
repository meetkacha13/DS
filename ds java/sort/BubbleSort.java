public class BubbleSort {
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    public static void main(String args[]) {
        BubbleSort bs = new BubbleSort();
        int arr[] = {10, 20, 5, 8, 9, 11, 30};
        bs.bubbleSort(arr);
        System.out.println("Sorted array");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
