class student{
    int rollno;
    String name;
    static String cname = "XYZ COLLEGE";
    student(int a,String b){
        rollno = a;
        name = b;
    }
    static void change(){//static function only accept static memmbers
    //    rollno = 122;   //this variable shoudn't work because of non-static varible  
        cname = "Sdj international college vesu";
    }
    void getdata(){
        System.out.println("Name : "+name);
        System.out.println("Rollno : "+rollno);
        System.out.println("College name :"+cname);
    }
}

public class StaticMemberFunction {
    public static void main(String argu[]){
        student st = new student(100, "paresh");
        st.getdata();
        student.change();//static method invoked by class name
        st.getdata();
    }
}
