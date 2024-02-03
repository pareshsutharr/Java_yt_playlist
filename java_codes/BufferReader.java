import java.io.*;
public record BufferReader() {
    public static void main(String[] argu)throws IOException{
        int a,b,sum;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a value : ");
        a = Integer.parseInt(br.readLine());
        System.out.println("enter b value : ");
        b = Integer.parseInt(br.readLine());
        sum = a+b;
        System.out.println("sum of a + b is :"+sum); 
    }
}
