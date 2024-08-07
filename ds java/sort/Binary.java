// package d2dDS;

import java.util.Scanner;

public class Binary {

    static int binarysearch(int a[], int n, int l, int r, int key) {
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] > key) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int a[] = new int[100];
        int n, key, i;

        System.out.println("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println("Enter the elements of array:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Elements are:");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);

        }

        System.out.println("Enter the element to be searched:");
        key = sc.nextInt();

        int pos = binarysearch(a, n, 0, n - 1, key);
        System.out.println("Index of an element is:" + pos);

    }
}
