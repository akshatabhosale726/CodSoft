package com.codSoft;
import java.util.Scanner;

public class StudentGradeCalculator {
    private int noOfSubjects;
    private int[] marks;  
    private int totalMarks = 0;
    private double average;
    private char grade;

    public void Calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        noOfSubjects = sc.nextInt();
        marks = new int[noOfSubjects];  
        
        for (int i = 0; i < noOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i+1) + ":- ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }
        average = totalMarks /  noOfSubjects ;

        if (average >= 90) grade = 'A';
        else if (average >= 80) grade = 'B';
        else if (average >= 70) grade = 'C';
        else if (average >= 60) grade = 'D';
        else grade = 'F';

        sc.close();
    }

    public void displayResult() {
        System.out.println(" --## Result Of Student ##--");
        System.out.println("Total Marks = " + totalMarks);
        System.out.printf("Average Percentage = %.2f%%\n", average);
        System.out.println("Grade = " + grade);
    }
}
