interface area {
   final static float pi=3.14f;
}
interface extendingarea extends area{
    float calculate(float a,float b);
}
class rectangle implements extendingarea{
    public float calculate(float a, float b){
        return a*b;
    }
}
class circle implements extendingarea{
    public float calculate(float a, float b){
        return pi*a*a;
    }
}
public class InterfaceExtend {
    public static void main(String[] args) {
        rectangle rect = new rectangle(); 
        circle cirl = new circle();
        float re,cir;
        extendingarea a;
        a=rect;   //interface a takes object reference 
        re = a.calculate(10, 20);
        System.out.println(re);
        a=cirl;    //interface a takes object reference 
        cir = a.calculate(10,0);
        System.out.println(cir);
    }
}








