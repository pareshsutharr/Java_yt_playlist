import java.util.Vector;

public class VectorElements {
    public static void main(String[] agru){
        Vector<String> list = new Vector<String>();
        list.addElement("paresh");//addElement used to add elements in vector object
        list.addElement("divesh");
        list.addElement("aanchal");
        list.addElement("rahul");
        System.out.println(list);
        list.insertElementAt("suthar", 1);//inserting by index
        System.out.println(list);
        int a = list.size();//giving return size of vector
        System.out.println(a);
        list.removeElement("rahul"); // remove by value
        System.out.println(list); 
        list.removeElementAt(1); // remove by index
        System.out.println(list);
        list.removeAllElements(); //remove by index
        System.out.println(list);
    }    
}
