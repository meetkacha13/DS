import java.util.Scanner;

class Linear {

    static int search(int a[], int n, int key) {
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                return i;
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

        int index = search(a, n, key);
        System.out.println("Index of element is:" + index);

    }

}