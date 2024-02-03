interface company {
    String companyname = "relience";
    double con = 185345;
    void companydata();
}
class shopkeeper{
    int price = 10000;
    String shopename = "Dmart";
    void putdata(){
        System.out.println("Shope name is : "+shopename);
        System.out.println("1 product pice is : "+price);
    }
    float items(int a){
        return price*a;
    }
}
class customer extends shopkeeper implements company{
    public void companydata(){
        System.out.println("company name is : "+companyname);
        System.out.println("company contact : "+con);
    }
    void display(){
        companydata();
        putdata();
    }
}
public class interfaceProgram {
    public static void main(String[] args) {
        customer paresh = new customer();
        float amount;
        paresh.display();
        amount = paresh.items(10);
        System.out.println("Total Amout of Product is : "+amount);
    }
}
