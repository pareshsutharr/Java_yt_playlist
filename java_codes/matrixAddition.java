public class matrixAddition {
    public static void main(String[]  argu){
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];
        int num = 5;
        System.out.println("values of array A :");
       for(int i =0;i<5;i++){
        a[i]=i;
        System.out.print(a[i]+ " ");
       }
       System.out.println();
       System.out.println("values of array B :");
       for(int i =0;i<5;i++){
        b[i]=num;
        num++;
        System.out.print(b[i] + " ");
       }
       System.out.println();
       System.out.println("values of sum array :");
       for(int i = 0;i<5;i++){
        c[i] = a[i]+b[i];
        System.out.print(c[i]+ " ");
       }
    }
}
