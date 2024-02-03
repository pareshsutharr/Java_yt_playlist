public class StringEquality {
    public static void main(String[] args) {
        String str = "paresh";
        String str2 = "PARESH";
        System.out.println(str.equals(str2));//false because of case sensitive
        System.out.println(str.equalsIgnoreCase(str2));// non - case sensitive
        String str3 = "hello";
        String str4 = "Hello";
        System.out.println(str3.compareTo(str4));
        System.out.println(str3.compareTo(str4));
        System.out.println(str3.compareTo(str4));
        System.out.println(str3.toLowerCase());  //converting lower case
        System.out.println(str3.toUpperCase());   //converting upper case
     }
}
