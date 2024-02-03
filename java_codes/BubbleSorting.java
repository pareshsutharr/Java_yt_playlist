import java.util.Scanner;

class bubble {
    int temp;
    int a[] = new int[10];

    // taking input

    void getdata(Scanner sc) {
        System.out.print("Enter Element to Bubble sort : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    // bubble sorting logic section

    void sort_bubble() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) { /// length -1 because of a[j+1] selector
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    // displaying shorted array

    void display() {
        System.out.print("Bubble Sorted Array is : ");
        for (int j = 0; j < a.length; j++) {
            System.out.print(" " + a[j]);
        }
    }
}

public class BubbleSorting {
    public static void main(String[] argu) {
        Scanner sc = new Scanner(System.in);
        bubble bub = new bubble();
        bub.getdata(sc);
        bub.sort_bubble();
        bub.display();
        sc.close();
    }
}
