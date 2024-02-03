public class loop {
    public static void show(){
        System.out.println("sparta..");
    }
    public static void main(String[] args) {
        show();
        int n = 0;
        while (n<=10){
            System.out.println(n);
            n++;
        }
        for(int i = 0;i<=5;i++){
            System.out.println(i);
                }
        for(int i = 0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
