package labhomework7;

import java.util.Random;


public class LabHomework7 {

    public static void main(String[] args) {
       int[] array = new int[10];
       System.out.println("Grade distribution:");
       Random randomNumbers = new Random();
      
      for (int i = 0; i < 30; i++) {
            ++array[ 1 + randomNumbers.nextInt(9)];
      }
       
       BarChart.outputBarChart(array);
       
       int max = BarChart.getMaximum(array);
       System.out.println("Maximum number: " + max);
       
       int min = BarChart.getMinimum(array);
       System.out.println("Minimum number: " + min);
       
       double avg = BarChart.getAverage(array);
       System.out.println("Average number: " + avg);
       
       
    }    
}
