public class methodOverloading {
    public static void main(String[] argu){
        System.out.println("method overloading program...");
        methodOverloading obj = new methodOverloading();
        int sqft = obj.area(100, 10);
        System.out.println(sqft);
        float size = obj.area(7);
        System.out.println(size);
    }

    public float area(float r) {
        float pi = 3.14f;
        return pi * r * r;
    }

    public int area(int l, int b) {
        return l * b;
    }
}
