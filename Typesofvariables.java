class Test
{  //static variable
    static int rollno=110;
}
public class Typesofvariables
{
   //instance variable
     String name="faasia";
    public static void main(String args[])
    {
        //local variable
        int n=10;
        Typesofvariables obj=new Typesofvariables(); 
        System.out.println(n);
       // System.out.println(name);//nonstatic variable cannot be used be used in static method
       System.out.println(obj.name);
        System.out.println(Test.rollno);

    }
}