import java.util.Scanner;
class Search_array{
    int a[] = new int[10];
    int key;
    void getdata(Scanner sc){
        System.out.print("Enter Array Element : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter Search element : ");
        key = sc.nextInt();
    }
    void search_element(){
        int i=0,j=9,flag=0,mid,pos=0;
        while (i<=j && flag ==0) {
            mid=(i+j)/2;
            if (a[mid] == key) {
                flag =1;
                pos = mid + 1;
            }
            if (a[mid]>key) {
                j= mid-1;
            }
            if (a[mid]<key) {
                i = mid +i;
            }
        }
        if (flag == 1) {
            System.out.println("Element found at position :" +pos);
        }
        else{
            System.out.println("Element not Found..");
        }
    }
}

public class BinearySearchClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Search_array aa = new Search_array();
        aa.getdata(sc);
        aa.search_element();
    }
}
