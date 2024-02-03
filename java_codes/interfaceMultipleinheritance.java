class student{
    int rollno;
    void getdata(int a){
        rollno=a;
    }
    void putdata(){
        System.out.println("Student Rollno is : "+rollno);
    }
}
class test extends student{
    int mark1,mark2,total;
    void getmarks(int a, int b){
        mark1 = a;
        mark2 = b;
        total = mark1+mark2;
    }
    void putmarks(){
        System.out.println("Student Marks Is : "+total);
    }
}
interface sports{
    int pt = 6;
    void putspots();
}
class result extends test implements sports{
    public void putspots(){
        System.out.println("Sports marks is : "+pt);
    }
    void display(){
        putdata();
        putmarks();
        putspots();
    }
}
public class interfaceMultipleinheritance {
    public static void main(String[] argu){
        result student = new result();
        student.getdata(101);
        student.getmarks(70,80);
        student.putdata();
        student.putmarks();
        student.putspots();
    }
}