import java.util.Scanner;
public class BinearySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key;
        int flag=0;
        int a[] = new int[10];
        System.out.print("Enter array elements : ");
        for (int i = 0; i < a.length; i++) {
            a[i]= sc.nextInt();
        }
        System.out.print("Enter Search Element : ");
        key = sc.nextInt();
        int i = 0;
        int j = 9;
        int pos=0;
        int mid; 
        while(i<=j && flag==0) {
        mid = (i+j)/2;
          if (a[mid]==key) {
            flag = 1;
            pos = mid+1;
          }
          if (a[mid]>key) {
            j = mid - 1;
          }
          if (a[mid]<key) {
            i = mid + 1;
          }
        }
        if (flag == 1) {
            System.out.println("Element found at Position : "+pos);
        }else{
            System.out.println("Element Not found..");
        }

        sc.close();
    }
}
