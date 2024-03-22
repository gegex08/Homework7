/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradebook;

/**
 *
 * @author geneivaocampo
 */

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

        GradeBook myGradeBook = new GradeBook("CSCI_1471 Computer Science II!", gradesArray);
        myGradeBook.displayMessage();
        myGradeBook.processGrades();
   } // end main
} // end class GradeBookTest