import java.util.Vector;

public class VectoIntro {
    public static void main(String[] agru){
        Vector<String> list = new Vector<String>();
        list.addElement("paresh");//addElement used to add elements in vector object
        list.addElement("divesh");
        list.addElement("aanchal");
        list.addElement("rahul");
        System.out.println(list);
        list.insertElementAt("suthar", 1);
        System.out.println(list);
    }    
}
