import java.util.*;

class usd {
    float temp;

    void usdToindia(float amount) {
        temp = amount * 83.36f;
        System.out.println("1 USD EQUELS TO 83 INDIAN RUPEESS ");
        System.out.println("Your Total indian rupees is  : " + temp);
    }

    void indiaTousd(float amount) {
        temp = 0.012f * amount;
        System.out.println("1 RUPEES EQUELS TO 0.012 ");
        System.out.println("Your Total USD is  : " + temp);
    }
}

class dhiram {
    float temp = 0;

    void dhiramToInr(float amount) {
        temp = amount * 22.70f;
        System.out.println("1 DHIRAM EQUELS TO 22.70 INDIAN RUPEESS ");
        System.out.println("Your Total indian rupees is  : " + temp);
    }

    void inrTodhiram(float amount) {
        temp = amount * 0.044f;
        System.out.println("1 DHIRAM EQUELS TO 22.70 INDIAN RUPEESS ");
        System.out.println("Your Total indian rupees is  : " + temp);
    }
}

class jpy {
}

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        usd us = new usd();
        dhiram dr = new dhiram();
        int choise = 0;
        float amount;
        System.out.println(" Select Currency Excenger ");
        System.out.println(" 1) INDIA TO USD ");
        System.out.println(" 2) USD TO INDIA ");
        System.out.println(" 3) DHIRAM TO INDIA ");
        System.out.println(" 4) INDIA TO DHIRAM ");
        System.out.print("Enter your Choise : ");
        choise = sc.nextInt();

        switch (choise) {
            case 1:
                System.out.print("Enter amount To get Exchange : ");
                amount = sc.nextFloat();
                us.usdToindia(amount);
                break;
            case 2:
                System.out.print("Enter amount To get Exchange : ");
                amount = sc.nextFloat();
                us.indiaTousd(amount);
                break;
            case 3:
                System.out.print("Enter amount To get Exchange : ");
                amount = sc.nextFloat();
                dr.dhiramToInr(amount);
                break;
            case 4:
                System.out.print("Enter amount To get Exchange : ");
                amount = sc.nextFloat();
                dr.inrTodhiram(amount);
                break;
            default:
                System.out.println("INVALID SELECTION...");
                break;
        }
        sc.close();
    }
}
