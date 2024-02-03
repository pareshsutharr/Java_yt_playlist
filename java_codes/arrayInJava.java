public class arrayInJava {
    public static void main(String[] argu){
        char[] a = new char[5];
        a[0]='a';
        a[1]='b';
        a[2]='c';
        a[3]='d';
        a[4]='e';
        for(int i=0;i<5;i++){
            System.out.print(a[i]);
        }
        int[] b = new int[10];
        for(int i = 0;i<10;i++){
            b[i] = i;
            System.out.println(b[i]);
        }
    }
}
