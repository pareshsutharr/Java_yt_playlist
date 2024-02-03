import java.util.*;
class array{
    int a[][] = new int[3][3];
    int b[][] = new int[3][3];

    void putdata(Scanner sc) { 
         System.out.println();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print("Value of Index " + i + " " + j + " : ");
                a[i][j] = sc.nextInt();
            }
        }
    }

    void display2() {
         System.out.println("First Matrix");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }
    }

    void Transpose() {
        System.out.println("Transpose of two matrix");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = a[j][i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(" " + b[i][j]);
            }
            System.out.println();
        }
    }
}

public class MatrixTranspose {
    public static void main(String[] argu) {
        Scanner sc = new Scanner(System.in);
        array aa = new array();
        aa.putdata(sc);
        aa.display2();
        aa.Transpose();
    }
}
