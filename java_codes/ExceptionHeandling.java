public class ExceptionHeandling {
    public static void main(String[] args) {
        int a=10,b=5,c=5;
        int result;
        try{
            result = a/(b-c);
            System.out.println(result);
        }
        catch(Exception e){
            System.out.println(e+" exception");
        }
    }
}
