 package arrayexpansion;

/****************************************************
 * Programmer: Geneiva Ocampo
 * 
 * Course CSCI 1471
 * 
 * Date 03/23/2024
 * 
 * Assignment: Homework #7: Array Expansion 
 * 
 * Environment Java with Netbeans
 * 
 * Files Included: ArrayExpansion
 * 
 * Purpose: Display Array, make a copy of the array, expand the array, null the array
 * 
 * Input: an Array of 10 numbers
 * 
 * Preconditions/ Assumptions: data type int 
 * 
 * Equations:   counter-1; i != array.length - 1
 * 
 * Output: Array, make a copy of the array, expand the array, null the array
 * 
 * Postconditions/Assumptions: data type int 
 * 
 * Contraints: Size of Array is 10 numbers
 * 
 * Algorithm: 
 * Input the numbers of the given array or apply 10 hard code integers in place
 * Display the index starting at value 1-10 and the value that it contains
 * Display a row of array
 * Make Copy and Display Original array and copy of Array
 * Expand and display the array by three and make them all zeros
 * Get the copy of the array and expand by three and revert the first 10 integers back to its original value
 * get method to set Array to be null
s ****************************************************/
public class ArrayExpansion {
   public static void main( String[] args )
   {
      int[] array  = {2, 3, 4, 5, 6, 9, 8, 7, 1, 8};

      // calculate value for each array element

      System.out.printf( "%s%8s\n", "Index", "Value" ); // column headings
   
      // output each array element's value 
      for ( int counter = 1; counter <= array.length; counter++ ){
         System.out.printf( "%5d%8d\n", counter, array[ counter - 1 ] );
      }
     

        // Step 1: At the starting point, arr represents 10 integers;
        System.out.println("After (a) new array of ten integers");
        printArray("arr", array);
        
        // Step 2: after step 1, original represents the same 10 integers
        int[] original = array;
        System.out.println("\nAfter (b) step 1 of expansion");
        printArray("arr", array);
        printArray("original", original);

        // Step 3: arr represents 12 integers, the first 10 of which are copied from original
        array = new int[12];//sets all values =0
        System.out.println("\nAfter (c) step 2 of expansion");
        printArray("arr", array);
        printArray("original", original);

        System.arraycopy(original, 0, array, 0, 10);
        System.out.println("\nAfter (c) step 3 of expansion (copy original integers)");
        printArray("arr", array);
        printArray("original", original);

        // Step 4: Set 'arr' to null to make the original 10 integers available for reclamation
        array = null;

        System.out.println("\nAfter (d)");
        printArray("arr", array);
        System.out.println("original  ==>  null\n");
    }

    // Helper method to print array values
    private static void printArray(String label, int[] array) {
        System.out.print(label + "   ==>  ");
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                //prints a comma and space if it is not the last element
                if (i != array.length - 1)
                    System.out.print(", ");
            }
        } else {
            System.out.print("null");
        }
        System.out.println();

   } // end main
}
