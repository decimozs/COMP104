import java.util.Scanner;

/*
* [Program Description] - The program's main purpose is to compute and determine the final grades for students.
* This process starts with calculating the average score by adding up a student's test scores and dividing the total by the number of tests taken.
* The grading system, letter grades, and additional comments are determined based on the average score.
*
* Group - 13
* Authors: Martin, Marlon A. (Leader)
*          Flores, Emily Rose
*          Angeles, Narayani Mhel
*
* Laboratory Exercise # 1
* Date: September 22, 2023
* */

public class Main {
  private static Scanner sc = new Scanner(System.in);

  private static float calculateAverage (int[] scores) {
    int length = scores.length;
    int sum = 0;
    for (int score : scores) {
      sum += score;
    }
    return (float) sum / length;
  }
  private static String calculateGrade(float avg){
    String grade = "";
    if(avg >= 90 && avg <= 100){
      grade = "A";
    } else if (avg >= 80 && avg <= 89) {
      grade = "B";
    } else if (avg >= 70 && avg <= 79) {
      grade = "C";
    } else if (avg >= 60 && avg <= 69) {
      grade = "D";
    } else {
      grade = "F";
    }

    return grade;
  }

  private static String calculateRemarks(float avg) {
    String remarks = "";
    if(avg >= 90 && avg <= 100){
      remarks = "Outstanding";
    } else if (avg >= 80 && avg <= 89) {
      remarks = "Very Satisfactory";
    } else if (avg >= 70 && avg <= 79) {
      remarks = "Satisfactory";
    } else if (avg >= 60 && avg <= 69) {
      remarks = "Fair";
    } else {
      remarks = "Needs Improvement";
    }

    return remarks;
  }

  private static String getStringInput (String message){
    sc = new Scanner(System.in);
    System.out.println(message);
    return sc.nextLine();
  }

  public static void main(String[] args) {
    String response = "";
    boolean isResponseValid;
    int[] scores;

    do {
      System.out.print("\nEnter student name: ");
      String name = sc.nextLine();
      System.out.print("Number of Test scores: ");
      int testScores = sc.nextInt();
      System.out.println("Enter the " + testScores + " Test Sores: ");
      scores = new int[testScores];

      for (int i = 0; i < scores.length ; i++) {
        scores[i] = sc.nextInt();
      }

      float average = calculateAverage(scores);

      System.out.println("\nOutput:");
      System.out.println("\nStudent Name: " + name);
      System.out.println("The Test Scores are: ");
      System.out.print("                     ");

      for (int i = 0; i < scores.length; i++) {
        System.out.printf("%5d", scores[i]);
        if ((i + 1) % 5 == 0) {
          System.out.println();
          System.out.print("                     ");
        }
      }

      System.out.println();
      System.out.println("Average  : " + String.format("%.2f", average));
      System.out.println("Grade    : " + calculateGrade(average));
      System.out.println("Remarks  : " + calculateRemarks(average));

      do {
        response = getStringInput("\nPlease try again [Y/N]");
        isResponseValid = !response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("n");

        if (isResponseValid) {
          System.out.println("\nInvalid Input");
        }
      }

      while (isResponseValid);
    }

    while (!response.equalsIgnoreCase("n"));
    System.out.println("\nProgram Terminated!");
  }
}