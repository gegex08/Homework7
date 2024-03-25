package labhomework7;

import java.util.Random;
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

public class LabHomework7 {

    public static void main(String[] args) {
       int[] array = new int[11];
       System.out.println("Grade distribution:");
       Random randomNumbers = new Random();
      
      for (int i = 0; i < 30; i++) {
            ++array[ randomNumbers.nextInt(11) ];
      }
       
       BarChart.outputBarChart(array);
       
       int max = BarChart.getMaximum(array);
       System.out.println("Maximum number: " + max);
       
       int min = BarChart.getMinimum(array);
       System.out.println("Minimum number: " + min);
       
       double avg = BarChart.getAverage(array);
       System.out.printf("Average number:  %.2f\n ", avg);
       
       
    }    
}
