
/**
 * Write a description of class testing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class testing
{
   
   
   public static void main(String[] args){
       Scanner console = new Scanner(System.in);
       damage(console);
    }
    
    public static void damage(Scanner console){
        System.out.print("My name is ");
        String name = console.nextLine();
    }
    
}
