import java.util.Scanner;

class two_d_array {
    int a[][] = new int[3][3];

    void getdata(Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print("Value of Index "+ i +" "+  j + " : ");
                a[i][j] = sc.nextInt();
            }
        }
    }
    void display(){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(" "+a[i][j]);
            }
        }
    }
}

public class TwoDimansionalArray {
    public static void main(String argu[]) {
        Scanner sc = new Scanner(System.in);
        two_d_array aa = new two_d_array();
        aa.getdata(sc);
        aa.display();
    }
}