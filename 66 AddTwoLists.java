import java.util.List;
import java.util.ArrayList;
class AddTwoLists {
    public static void main(String args[])
    {
        List<String> list1=new ArrayList<String>();
        list1.add("Ganga");
         List<String> list2=new ArrayList<String>();
         list2.add("Yamuna");
         List<String> list3=new ArrayList<String>();
         list3.addAll(list1);
         list3.addAll(list2);
         
         System.out.println("List1="+list1);
         System.out.println("List2="+list2);
         System.out.println("Joined List="+list3);
    }
}
      
