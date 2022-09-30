import java.util.*;
class CovertSetToArray {
    public static void main(String args[])
    {
      Set<String> set=new HashSet<>();
      set.add("APPLE");
      set.add("ORANGE");
      set.add("BANANA");
      set.add("PINE APPLE");
      
      String array[]=new String[set.size()];
      set.toArray(array);
      
      System.out.println("Array is"+Arrays.toString(array));
    }
}
