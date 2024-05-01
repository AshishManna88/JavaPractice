package demo.challenges87;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThrowsExceptionPrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        try{
            name = getName(name);
            System.out.println(name);
        }catch(Exception e) {
            System.out.println("Error is: "+e.getMessage());
        }
    }
    public static String getName(String name) throws Exception{
        if (name.contains("@")) {
            throw new IllegalArgumentException();
        }
        else if(stingHasNumber(name)){
            throw new ArithmeticException();
        }
        return name;
    }
    public static boolean stingHasNumber(String name){

        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(name);

        return matcher.find();
    } 
}
