public class StaticDataMember {
   int rollno;
   String name;
   static String cname="SDJ INTERNATIONAL COLLEGE";
   StaticDataMember(int a,String y){
    rollno = a;
    name = y;
   }
   void getdata(){
    System.out.println("Name : "+name);
    System.out.println("Rollno :"+rollno);
    System.out.println("College Name :"+cname);
   }
   public class marks{
    float sub1,sub2,sub3;
    float per;
    float total;
    marks(int a,int b,int c){
        sub1=a;
        sub2=b;
        sub3=c;
        // getpercentage();
    }
    void getpercentage(){
      total = sub1+sub2+sub3;
      per = (total/300)*100;
      System.out.println("Total Marks is :"+total);
      System.out.println("Percentage is :"+per);
    }

   }
   public static void main(String argu[]){
     StaticDataMember sc = new StaticDataMember(10, "paresh");
     sc.getdata();
     StaticDataMember.marks st = sc.new marks(60, 60, 60);
     st.getpercentage();
   }
}
