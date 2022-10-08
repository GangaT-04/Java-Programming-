
class ConvertWrappperObjectIntoPrimitiveTypes {
    public static void main(String a[])
    {
        Integer o1 = Integer.valueOf(20);
        Double o2 = Double.valueOf(11.55);
        Boolean o3 = Boolean.valueOf(true);
        
        int var1 = o1.intValue();
        double var2 = o2.doubleValue();
        boolean var3 = o3.booleanValue();

    System.out.println("The value of int variable: " + var1);
    System.out.println("The value of double variable: " + var2);
    System.out.println("The value of boolean variable: " + var3);
    }
}
