
package gradebook;

/****************************************************
 * Programmer: Geneiva Ocampo
 * 
 * Course CSCI 1471
 * 
 * Date 03/23/2024
 * 
 * Assignment: Homework #7:GradebookTest
 * 
 * Environment Java with Netbeans
 * 
 * Files Included: GradebookTest and Gradebook
 * 
 * Purpose: create GradeBook object using a two-dimensional array of grades, then invokes method processGrades to get course name, 
 * a message, a min and max, the average, and a chart of the grades with perspective grades and asterisks
 * 
 * Input: an Array of 30 numbers, course name
 * 
 * Preconditions/ Assumptions: data type int 
 * 
 * Equations:   ++frequency[ grade / 10 ]; count * 10, count * 10 + 9; total += grade;
 * return (double) total / setOfGrades.length;, grade<lowGrade; grade > highGrade;
 *  test + 1 ; student + 1
 * 
 * Output:Course name, course message, Min, Max, Average, BarChart
 * 
 * Postconditions/Assumptions: data type int 
 * 
 * Contraints: Size of Array is 30 numbers
 * 
 * Algorithm: 
 * Input the numbers of the given array or apply 30 hard code integers in place for the array of grades
 * In one class Invoke the method and in the other create the method to display course name
 * In one class Invoke the method and in the other create the method to display course message
 * In one class Invoke the method and in the other create the method to display min, max, average, and bar chart for the array of grades
 ****************************************************/

/////////////////////////////////////////////////
////// Using the Class //////////////////////////
// GradeBookTest.java
// GradeBookTest creates GradeBook object using a two-dimensional array  
// of grades, then invokes method processGrades to analyze them.
public class GradeBookTest {
    public static void main(String[] args) {
        int[][] gradesArray = { { 87, 96, 70 },
                                { 68, 87, 90 },
                                { 94, 100, 90 },
                                { 100, 81, 82 },
                                { 83, 65, 85 },
                                { 78, 87, 65 },
                                { 85, 75, 83 }, 
                                { 91, 94, 100 },
                                { 76, 72, 84 },
                                { 87, 93, 73 } };


        GradeBook myGradeBook = new GradeBook("Java Course 1471 Computer Science II!", gradesArray);
        myGradeBook.displayMessage();
        myGradeBook.processGrades();
   } // end main
} // end class GradeBookTest