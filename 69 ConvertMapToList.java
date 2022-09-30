import java.util.*;

class ConvertArrayToSet {
    public static void main(String args[])
    {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1, "Ganga");
        map.put(2,"Yamuna");
        map.put(3,"Aathi");
        map.put(4, "Vaish");
        map.put(5, "Narmatha");
        
        List<Integer> key=new ArrayList(map.keySet());
        List<String>values=new ArrayList(map.values());
        
        System.out.println("Key set is"+key);
        System.out.println("Value set is"+values);
    }
}
