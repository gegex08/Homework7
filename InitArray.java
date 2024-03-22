
package initarray;

/**
 *
 * @author geneivaocampo
 */
public class InitArray {

   
   // create and output two-dimensional arrays
   public static void main( String[] args )
   {
      int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 } };        
      int[][] array2 = { { 1, 2 }, { 3 }, { 4, 5, 6 } }; 

      System.out.println( "Values in array1 by row are" );
      outputArray( array1 ); // displays array1 by row
      System.out.println("The average value of array1 is: " + getAverage(array1));

   
      System.out.println( "\nValues in array2 by row are" );
      outputArray( array2 ); // displays array2 by row
      System.out.println("The average value of array2 is: " + getAverage(array2));

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
