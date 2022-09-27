class StringIsNullOrEmpty {
    public static void main(String args[])
    {
        String s1=null;
        String s2="";
        String s3=" ";
        System.out.println("String1 is "+isNullEmpty(s1));
        System.out.println("String2 is "+isNullEmpty(s2));
        System.out.println("String3 is "+isNullEmpty(s3));
    }
    public static String isNullEmpty(String s)
    {
        if(s==null)
        {
            return "NULL";
        }
        else if(s.isEmpty())
        {
            return "Empty";
        }
        else
        {
            return "Neithe Null nor Empty";
        }
    }
}
