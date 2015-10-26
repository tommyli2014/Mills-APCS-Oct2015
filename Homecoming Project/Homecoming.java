
/**
 * This is the homecoming project.
 * 
 * Tommy Li
 * 10/24/15
 */

import java.util.Scanner;

public class Homecoming
{
  
   
   public static void main(String[] args){
       Scanner console = new Scanner(System.in);
       getADate(console);
    }
    
   public static void getADate(Scanner console){
        System.out.print("Hi! My name is ");
        String myName = console.nextLine(); 
        
        System.out.println("What's your name?");
        String theirName = console.nextLine();
        
        System.out.println("Nice to meet you " + theirName+ ".");
        System.out.println();
        
        System.out.println("Would you like to go to Homecoming with me?");
        String yesOrNo = console.nextLine();
        
        System.out.println("Great! It'll be a magical night -- " + myName + " and " + theirName + " going to the Mills Homecoming Dance 2015!");
        
        damage(console, myName, theirName);
    }
    
   public static void damage(Scanner console, String myName, String theirname){
        System.out.println("Let's figure out the damage for the evening.");
        System.out.println();
        System.out.println("What are your estimated costs?");
        
        //Here are the list of costs inputed by the user
        System.out.print("Tickets(each): ");
        double eachTicket = console.nextDouble();
        System.out.print("Flowers(total for both of you): ");
        double flowers = console.nextDouble();
        System.out.print("Pictures: ");
        double pictures = console.nextDouble();
        System.out.print("Dinner(per meal): ");
        double dinnerForEach = console.nextDouble();
        System.out.print("New Clothes(tie to match dress? Vest? Dress? Non-tennis shoes?): ");
        double clothes = console.nextDouble();
        System.out.print("Any other expenses: ");
        double other = console.nextDouble();
        
        
        System.out.println();
        
        
        double subtotal = eachTicket * 2 + flowers + pictures + dinnerForEach * 2 + clothes + other;
        double tax = subtotal * 0.0825;
        double total = subtotal + tax;
        System.out.println("So, you should expect to spend, including tax, " + total);
        System.out.println("If you split the costs with your date, each will pay " + (total/2));
        

        
        //Here's where I call method 3 so I can use the values in damage method in the stats method
        statsTable(eachTicket, flowers, pictures, (dinnerForEach*2), clothes, other, subtotal, tax, total, myName, theirname);
   }
   
   public static void statsTable(double ticket, double flower, double picture, double dinner, double clothes, double other, double subtotal, double tax, double total, String myName, String theirName){
        System.out.println(); 
        System.out.println("MHS Homecoming 2015");
        System.out.println(myName + " and " + theirName);
        System.out.println();
        
        System.out.println("Ticket(total):\t\t\t" + (ticket*2));
        System.out.println("Flowers (for both of you):\t" + flower);
        System.out.println("Pictures:\t\t\t" + picture);
        System.out.println("Dinner(for two):\t\t" + dinner);
        System.out.println("New clothes:\t\t\t" + clothes);
        System.out.println("Any other expenses:\t\t" + other);
        System.out.println();
        
        
        System.out.println("\t\t\t\tSubtotal    " + (double)(Math.round(subtotal*100))/100);
        System.out.println("\t\t\t\tSales tax   " + (double)(Math.round(tax*100))/100);
        System.out.println("\t\t\t\tTotal       " + (double)(Math.round(total*100))/100);
   }
}
