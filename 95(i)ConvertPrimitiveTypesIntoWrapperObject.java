class ConvertPrimitiveTypesIntoWrapperObject {
    public static void main(String a[])
    {
        int v1=10;
        double v2=100.8643;
        boolean v3=false;
        
        Integer obj1 = Integer.valueOf(v1);
        Double obj2 = Double.valueOf(v2);
        Boolean obj3 = Boolean.valueOf(v3);
        
        if(obj1 instanceof Integer) {
      System.out.println("An object of Integer is created.");
    }

    if(obj2 instanceof Double) {
      System.out.println("An object of Double is created.");
    }

    if(obj3 instanceof Boolean) {
      System.out.println("An object of Boolean is created");
    }

    }
}
