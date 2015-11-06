
/**
 * This program is for ProcessingNumber project
 * 
 * Tommy Li
 * 10/4/15
 */

import java.util.*;

public class ProcessingNumbers
{
    public static void main(String[] args){
        numbers();
    }
    
    public static void numbers(){
        Scanner console = new Scanner(System.in);
        int evenSum = 0;
        int maxEven = 0;
        System.out.print("How many numbers do you want?");
        int totalNumbers = console.nextInt();
        
        System.out.print("What's your first number? ");
        int next = console.nextInt();
        
        
        //initalizing min and max
        int min = next;
        int max = next;
        
        //initalzing evenSum and maxEven
        if (next % 2 == 0){
            evenSum += next;
            maxEven = next;
        }
       
         for(int i = 1; i <= totalNumbers-1; i++){
            System.out.print("What is your next number? ");
            next = console.nextInt();
           
             //here's where I select the max and min numbers
            if (next > max){
            max = next;
            }
             if (next < min){
            min = next;
            }
       
            //here's where I find the largest even numbers and their sum
            if (next % 2 == 0){
             evenSum += next;
             
             if(next > maxEven){
                 maxEven = next;
                }
            }
            }   
            
         System.out.println();
            //stating what happens if user didn't input any even numbers
         if(maxEven == 0){
                System.out.println("You didn't enter any even number.");
         }else{
                System.out.println("The sum of all even numbers is " + evenSum);
                System.out.println("The largest even number is " + maxEven);
         }
            
       //here's where I print out all the outputs
       System.out.println();
       System.out.println("The largest number is " + max);
       System.out.println("The smallest number is " + min);
       }
    
       
    } 


