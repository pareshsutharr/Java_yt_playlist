import java.util.Scanner;
public class SortingElements {
    public static void main(String[] argu){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    int rep1;
    System.out.print("Enter Array Elements : ");
    for (int i = 0; i < a.length; i++) {
        a[i] = sc.nextInt();
    }
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length; j++) {
            if (a[i]<a[j]) {
                rep1 = a[i];
                a[i]=a[j];
                a[j]=rep1;
            }
        }
    }
    for (int i = 0; i < a.length; i++) {
        System.out.print(" " + a[i]);
    };
    sc.close();
    }
}
