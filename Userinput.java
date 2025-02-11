import java.io.*;
public class Userinput
{
    public static void main(String args[])
    {
        try
        {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(sc.readLine());
        System.out.println(a);
        }
         catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

}