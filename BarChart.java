
package labhomework7;
/****************************************************
 * Programmer: Geneiva Ocampo
 * 
 * Course CSCI 1471
 * 
 * Date 03/23/2024
 * 
 * Assignment: Homework #7: Barchart 
 * 
 * Environment Java with Netbeans
 * 
 * Files Included: Barchart & Homework7
 * 
 * Purpose: Write a program that displays asterisk for each number 30 different random times, get max and min numbers, calculate average
 * 
 * Input: random generated grade and an array of grades
 * 
 * Preconditions/ Assumptions: grades range from 1-100
 * 
 * Equations:  total / array.length, grade < lowNum, grade > highNum, total += (i * 10) * array[i]
 * 
 * Output: Max, Min, Average
 * 
 * Postconditions/Assumptions: grades range from 1-100
 * 
 * Contraints: Needs to be 30 random grades
 * 
 * Algorithm: 
 * Program will get and display 30 random asterisk to represent grades
 * program will the get and display method to get Max
 * program will the get and display method to get Min
 * program will the get and display method to get Average of all the numbers
 ****************************************************/
public class BarChart {
    
      //Random 30 int between 1-100
      public static void outputBarChart(int [] array) {
      
      // for each array element, output a bar of the chart
          //numbers startting at 0; as long as they are less than 11; iterate
      for ( int counter = 0; counter < array.length; counter++ ) 
      {
         // output bar label ( "00-09: ", ..., "90-99: ", "100: " )
         if ( counter == 10 )//if the iteration is at 10
            System.out.printf( "%5d: ", 100 ); //print 100
         else
             
            System.out.printf( "%02d-%02d: ", //2 digits - 2 digits(note: if array index only has 1 digit the number will be padded with 0's
               counter * 10, counter * 10 + 9  ); //multiply the array index *10 for the first digits - then multiply by 10 and ad 9 to the the next 2 digits
 
         // print bar of asterisks
         for ( int stars = 0; stars < array[ counter ]; stars++ )//as long as the stars start at 0; grades are less than 100; continue adding stars
            System.out.print( "*" );

         System.out.println(); // start a new line of output
      } // end outer for
      } // end of random Barchart method
      
      //get Max Method
      public static int getMaximum(int [] array){
        
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
      public static int getMinimum(int [] array){
        
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
      public static double getAverage( int[] array )
        {      
      int total = 0; // initialize total
 
      // Sum of numbers excluding the last element
        for (int i = 0; i < array.length - 1; i++) {
            
            total += (i * 10) * array[i]; // Multiply the grade by its frequency
        }

        // Calculate the total number of grades excluding the last category
        int totalCount = 0;

        //For each number in the array
        for (int num : array) {

            //add each number to the total Count
            totalCount += num;
        }

        // Calculate the average of grades
        return (double) total / totalCount;
            } // end method getAverage

      
} // end class BarChart

