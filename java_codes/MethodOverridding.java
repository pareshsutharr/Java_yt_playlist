class base{
    /*final */ void message(){//uncomment final keyword to solve methodoverridding
        System.out.println("Welcome to base class...");
    }
}
class derived extends base{
    void message(){
        System.out.println("Welcome to derived class...");
    }
}

public class MethodOverridding {
    public static void main(String[] args) {
        derived aa = new derived();
        aa.message();
    }
}
