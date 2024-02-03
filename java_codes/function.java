public class function {
    public static void main(String[] argu){
        function obj = new function();
       int sum = obj.add(10, 20);
       System.out.println(sum);
       int mull = obj.mul(10, 20);
       System.out.println(mull);
    }
    public int add(int a,int b){
       System.out.println(a+b);
       return a+b;
    }
     public int mul(int a,int b){
       System.out.println(a*b);
       return a*b;
    }
}
