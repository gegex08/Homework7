
package labhomework7;
/**
 *
 * @author geneivaocampo
 */
public class BarChart {
    
      //Random 30 int between 1-100
      static void outputBarChart(int [] array) {
      
      // for each array element, output a bar of the chart
      for ( int counter = 0; counter < array.length; counter++ ) 
      {
         // output bar label ( "00-09: ", ..., "90-99: ", "100: " )
         if ( counter == 10 )
            System.out.printf( "%5d: ", 100 ); 
         else
            System.out.printf( "%02d-%02d: ", 
               counter * 10, counter * 10 + 9  ); 
 
         // print bar of asterisks
         for ( int stars = 0; stars < array[ counter ]; stars++ )
            System.out.print( "*" );

         System.out.println(); // start a new line of output
      } // end outer for
      } // end of random Barchart method
      
      //get Max Method
      static int getMaximum(int [] array){
        
        // Assume the first element of the array is the largest
        int highNum = array[0];

        // Loop through the array and update highNum if a larger element is found
        for (int grade : array) {
            if (grade > highNum)
                highNum = grade;
        }
        return highNum;
      }//end of Max Method
      //get Min Method
      static int getMinimum(int [] array){
        
        // Assume the first element of the array is the largest
        int lowNum = array[0];

        // Loop through the array and update highNum if a larger element is found
        for (int grade : array) {
            if (grade < lowNum)
                lowNum = grade;
        }
        return lowNum;
      }//end of minMethod
      
      //get Avg Method
      static double getAverage( int[] array )
        {      
      int total = 0; // initialize total
 
      // sum of numbers
      for ( int num : array )
          //store the sum in total
         total += num;

      // return average of grades
      return (double) total / array.length;
        } // end method getAverage
      
      
      
      
} // end class BarChart
