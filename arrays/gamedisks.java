package arrays;
public class gamedisks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an array object that stores only Strings
        // and store a reference to that array in the variable books
        String[] books = new String[5];
        
        books[0] = "Perl Cookbook";
        books[1] = "PHP Cookbook";
        books[2] = "Python in a Nutshell";
        books[3] = "PHP Javascript: The Definitive Guide";
        books[4] = "Java in a Nutshell";
    }//close main
    public static void preintArrayContents(String[] arrayInsideMethod){
        System.out.println("*********** Extract array value and store it ************");
        //Extract contents of each array bin, then print it to the console 
        String extractedArrayValue = arrayInsideMethod[0];
        System.out.println("Book at array at index 0: " + extractedArrayValue );
        // do this process for reach bin of the array
        extractedArrayValue = arrayInsideMethod[1];
        System.out.println("Book at index 1: " + extractedArrayValue );
        extractedArrayValue = arrayInsideMethod[2];
        System.out.println("Book at index 2: " + extractedArrayValue );
        extractedArrayValue = arrayInsideMethod[3];
        System.out.println("Book at index 3: " + extractedArrayValue );
        extractedArrayValue = arrayInsideMethod[4];
        System.out.println("Book at index 4: " + extractedArrayValue );
    }//close preintArrayContents
    
}//close class
