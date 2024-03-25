
package initarray;

/****************************************************
 * Programmer: Geneiva Ocampo
 * 
 * Course CSCI 1471
 * 
 * Date 03/23/2024
 * 
 * Assignment: Homework #7: InitArray 
 * 
 * Environment Java with Netbeans
 * 
 * Files Included: InitArray
 * 
 * Purpose: Display Array and then Average
 * 
 * Input: 2-dimensional Array
 * 
 * Preconditions/ Assumptions: data type int 
 * 
 * Equations:   total += num; total / count;
 * 
 * Output: Array and Average
 * 
 * Postconditions/Assumptions: data type int 
 * 
 * Contraints: Size of Array
 * 
 * Algorithm: 
 * Input the numbers of the given array or apply hard code integers in place
 * Call method Display the arrays without barriers
 * call method to Calculate and display the average
 ****************************************************/
public class InitArray {

   
   // create and output two-dimensional arrays
   public static void main( String[] args )
   {
      int[][] array1 = { { 4, 2, 3 }, { 4, 5, 6 } };       
      int[][] array2 = { { 4, 2 }, { 3 }, { 4, 5, 6 } }; 

      System.out.println( "Values in array1 by row are" );
      outputArray( array1 ); // displays array1 by row
      System.out.printf("The average value of array1 is: %.1f", getAverage(array1));

   
      System.out.println( "\nValues in array2 by row are" );
      outputArray( array2 ); // displays array2 by row
      System.out.printf("The average value of array2 is: %.1f\n", getAverage(array2));
   } // end main

   // output rows and columns of a two-dimensional array
   public static void outputArray( int[][] array )
   {
       // loop through array's rows
      for ( int row = 0; row < array.length; row++ ) 
      {
         // loop through columns of current row
         for ( int column = 0; column < array[ row ].length; column++ )
            System.out.printf( "%d  ", array[ row ][ column ] );

         System.out.println(); // start new line of output
      } // end outer for  
   } // end method outputArray
   
   //get average mthod
   public static double getAverage(int[][] array) {
       //to store the total
        int total = 0;
        //to initialize the beginning of the amount of times it counts 
        int count = 0;
        //for every row in the array
        for (int[] row : array) {
            //for each number in the array
            for (int num : row) {
                //add each number on that row and add to total
                total += num;
                //continue this step with the next
                count++;
            }
        }
        return (double) total / count;
   }//end of method
} // end class InitArray
