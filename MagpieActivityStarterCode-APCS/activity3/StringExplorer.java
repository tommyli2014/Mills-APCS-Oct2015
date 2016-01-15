package activity3;

/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        
        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println ("sample.indexOf(\"quick\") = " + position);
        
        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println ("sample.toLowerCase() = " + lowerCase);
        System.out.println ("After toLowerCase(), sample = " + sample);
        
        //  Try other methods here:
        
        // Demonstrate the indexOf method
        int notFoundPsn = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);

        //Demonstrate the indexOf method for finding the index of first occurrence of a String after a given index
        int theAfterTen = sample.indexOf("the", 10);
        System.out.println("sample.indexOf(\"the\") = " + theAfterTen);
        
        //Demonstrate the substring method
        String firstThreeLetter = sample.substring(0, 3);
        System.out.println("sample.substring(0, 3) = " + firstThreeLetter);
    }

}
