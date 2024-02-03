public class swapProgram {
    public static void main(String[] argu){
     swapProgram obj = new swapProgram();
     obj.swap(10, 20);
    }
    public void swap(int a,int b){
     System.out.println(a+ "" +b);
     int c;
     c=a;
     a=b;
     b=c;
     System.out.println(a+ "" +b);

    }
}
