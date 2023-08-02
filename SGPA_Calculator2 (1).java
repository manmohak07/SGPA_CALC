//package com.Mohak;
import java.util.Scanner;
public class SGPA_Calculator2 {






        public static void main(String[] args) {


            int Maths, MathCredit, MathCgpa;
            int Marks_3Credits, credit1, credit1Cgpa;
            int Marks_2Credits, credit2, credit2Cgpa;
            int Marks2_2Credits, credit3, credit3Cgpa;
            int elective1, credit4, credit4Cgpa;
            int elective2, credit5, credit5Cgpa;
            Scanner x = new Scanner(System.in);
            System.out.println("Enter your marks in Mathematics");
            Maths = x.nextInt();
            System.out.println("Enter the credits of Maths");
            MathCredit = x.nextInt();
            System.out.println("Enter your marks in Physics/Chemistry/Sub");
            Marks_3Credits = x.nextInt();
            System.out.println("Enter the credits of this subject");
            credit1 = x.nextInt();
            System.out.println("Enter your marks in Subject 1");
            Marks_2Credits = x.nextInt();
            System.out.println("Enter the credits of this subject");
            credit2 = x.nextInt();

            System.out.println("Enter your marks in Subject 2");
            Marks2_2Credits = x.nextInt();
            System.out.println("Enter the credits of this subject");
            credit3 = x.nextInt();
            System.out.println("Enter your marks in Elective 1");
            elective1 = x.nextInt();
            System.out.println("Enter the credits of this subject");
            credit4 = x.nextInt();
            System.out.println("Enter your marks in Elective 2");
            elective2 = x.nextInt();
            System.out.println("Enter the credits of this subject");
            credit5 = x.nextInt();

            if (Maths <= 100 && Maths >= 90) {
                MathCgpa = 10;
            } else if (Maths <= 90 && Maths >= 80) {
                MathCgpa = 9;
            } else if (Maths <= 80 && Maths >= 70) {
                MathCgpa = 8;
            } else if (Maths <= 70 && Maths >= 60) {
                MathCgpa = 7;
            } else if (Maths <= 60 && Maths >= 50) {
                MathCgpa = 6;
            } else if (Maths <= 50 && Maths >= 40) {
                MathCgpa = 5;
            } else {
                MathCgpa = 4;
                System.out.println("Sorry you failed in Maths");

            }
            if (Marks_3Credits <= 100 && Marks_3Credits >= 90) {
                credit1Cgpa = 10;
            } else if (Marks_3Credits <= 90 && Marks_3Credits >= 80) {
                credit1Cgpa = 9;
            } else if (Marks_3Credits <= 80 && Marks_3Credits >= 70) {
                credit1Cgpa = 8;
            } else if (Marks_3Credits <= 70 && Marks_3Credits >= 60) {
                credit1Cgpa = 7;
            } else if (Marks_3Credits <= 60 && Marks_3Credits >= 50) {
                credit1Cgpa = 6;
            } else if (Marks_3Credits <= 50 && Marks_3Credits >= 40) {
                credit1Cgpa = 5;
            } else {
                credit1Cgpa = 4;
                System.out.println("Sorry you failed in this subject");

            }
            if (Marks_2Credits <= 100 && Marks_2Credits >= 90) {
                credit2Cgpa = 10;
            } else if (Marks_2Credits <= 90 && Marks_2Credits >= 80) {
                credit2Cgpa = 9;
            } else if (Marks_2Credits <= 80 && Marks_2Credits >= 70) {
                credit2Cgpa = 8;
            } else if (Marks_2Credits <= 70 && Marks_2Credits >= 60) {
                credit2Cgpa = 7;
            } else if (Marks_2Credits <= 60 && Marks_2Credits >= 50) {
                credit2Cgpa = 6;
            } else if (Marks_2Credits <= 50 && Marks_2Credits >= 40) {
                credit2Cgpa = 5;
            } else {
                credit2Cgpa = 4;
                System.out.println("Sorry you failed in this subject");

            }
            if (Marks2_2Credits <= 100 && Marks2_2Credits >= 90) {
                credit3Cgpa = 10;
            } else if (Marks2_2Credits <= 90 && Marks2_2Credits >= 80) {
                credit3Cgpa = 9;
            } else if (Marks2_2Credits <= 80 && Marks2_2Credits >= 70) {
                credit3Cgpa = 8;
            } else if (Marks2_2Credits <= 70 && Marks2_2Credits >= 60) {
                credit3Cgpa = 7;
            } else if (Marks2_2Credits <= 60 && Marks2_2Credits >= 50) {
                credit3Cgpa = 6;
            } else if (Marks2_2Credits <= 50 && Marks2_2Credits >= 40) {
                credit3Cgpa = 5;
            } else {
                credit3Cgpa = 4;
                System.out.println("Sorry you failed in this subject");

            }
            if (elective1 <= 100 && elective1 >= 90) {
                credit4Cgpa = 10;
            } else if (elective1 <= 90 && elective1 >= 80) {
                credit4Cgpa = 9;
            } else if (elective1 <= 80 && elective1 >= 70) {
                credit4Cgpa = 8;
            } else if (elective1 <= 70 && elective1 >= 60) {
                credit4Cgpa = 7;
            } else if (elective1 <= 60 && elective1 >= 50) {
                credit4Cgpa = 6;
            } else if (elective1 <= 50 && elective1 >= 40) {
                credit4Cgpa = 5;
            } else {
                credit4Cgpa = 4;
                System.out.println("Sorry you failed in this subject");

            }
            if (elective2 <= 100 && elective2 >= 90) {
                credit5Cgpa = 10;
            } else if (elective2 <= 90 && elective2 >= 80) {
                credit5Cgpa = 9;
            } else if (elective2 <= 80 && elective2 >= 70) {
                credit5Cgpa = 8;
            } else if (elective2 <= 70 && elective2 >= 60) {
                credit5Cgpa = 7;
            } else if (elective2 <= 60 && elective2 >= 50) {
                credit5Cgpa = 6;
            } else if (elective2 <= 50 && elective2 >= 40) {
                credit5Cgpa = 5;
            } else {
                credit5Cgpa = 4;
                System.out.println("Sorry you failed in this subject");

            }

            int MathFinal = MathCgpa * MathCredit;
            int PCS = credit1 * credit1Cgpa;
            int Sub1Final = credit2 * credit2Cgpa;
            int Sub2Final = credit3 * credit3Cgpa;
            int Elective1Final = credit4 * credit4Cgpa;
            int Elective2Final = credit5 * credit5Cgpa;
            float CreditSUM = MathCredit + credit1 + credit2 + credit3 + credit4 + credit5;
            float FinalMarks = MathFinal + PCS + Sub1Final + Sub2Final + Elective1Final + Elective2Final;

            float sgpa_withoutLab = FinalMarks / CreditSUM;
            System.out.println("Your SGPA without adding laborartory marks are " + sgpa_withoutLab);




            Scanner y = new Scanner(System.in);
            int Lab1, LabCredit;
            int Lab2, LabCredit2;
            int Lab3, LabCredit3;
            int Lab4, LabCredit4;
            int Lab5, LabCredit5;

            System.out.println("Enter your marks in Lab1");
            Lab1 = y.nextInt();
            System.out.println("Enter the credits of this lab");
            LabCredit = y.nextInt();
            System.out.println("Enter your marks in Lab2");
            Lab2 = y.nextInt();
            System.out.println("Enter the credits of this lab");
            LabCredit2 = y.nextInt();
            System.out.println("Enter your marks in Lab3");
            Lab3 = y.nextInt();
            System.out.println("Enter the credits of this lab");
            LabCredit3 = y.nextInt();
            System.out.println("Enter your marks in Lab4");
            Lab4 = y.nextInt();
            System.out.println("Enter the credits of this lab");
            LabCredit4 = y.nextInt();
            System.out.println("Enter your marks in Lab5");
            Lab5 = y.nextInt();
            System.out.println("Enter the credits of this lab");
            LabCredit5 = y.nextInt();

            int Lab1_Grade = 0, Lab2_Grade = 0, Lab3_Grade = 0, Lab4_Grade= 0, Lab5_Grade = 0;

            if (Lab1 <= 100 && Lab1 >= 90) {
                Lab1_Grade = 10;
            } else if (Lab1 <= 90 && Lab1 >= 80) {
                Lab1_Grade = 9;
            } else if (Lab1 <= 80 && Lab1 >= 70) {
                Lab1_Grade = 8;
            } else if (Lab1 <= 70 && Lab1 >= 60) {
                Lab1_Grade = 7;
            } else if (Lab1 <= 60 && Lab1 >= 50) {
                Lab1_Grade = 6;
            } else if (Lab1 <= 50 && Lab1 >= 40) {
                Lab1_Grade = 5;
            } else if (Lab1 < 40) {
                System.out.println("You have failed this lab");
                Lab1_Grade = 4;
            }

            if (Lab2 <= 100 && Lab2 >= 90) {
                Lab2_Grade = 10;
            } else if (Lab2 <= 90 && Lab2 >= 80) {
                Lab2_Grade = 9;
            } else if (Lab2 <= 80 && Lab2 >= 70) {
                Lab2_Grade = 8;
            } else if (Lab2 <= 70 && Lab2 >= 60) {
                Lab2_Grade = 7;
            } else if (Lab2 <= 60 && Lab2 >= 50) {
                Lab2_Grade = 6;
            } else if (Lab2 <= 50 && Lab2 >= 40) {
                Lab2_Grade = 5;
            } else if (Lab2 < 40) {
                System.out.println("You have failed this lab");
                Lab2_Grade = 4;
            }

            if (Lab3 <= 100 && Lab3 >= 90) {
                Lab3_Grade = 10;
            } else if (Lab3 <= 90 && Lab3 >= 80) {
                Lab3_Grade = 9;
            } else if (Lab3 <= 80 && Lab3 >= 70) {
                Lab3_Grade = 8;
            } else if (Lab3 <= 70 && Lab3 >= 60) {
                Lab3_Grade = 7;
            } else if (Lab3 <= 60 && Lab3 >= 50) {
                Lab3_Grade = 6;
            } else if (Lab3 <= 50 && Lab3 >= 40) {
                Lab3_Grade = 5;
            } else if (Lab3 < 40) {
                System.out.println("You have failed this lab");
                Lab3_Grade = 4;
            }

            if (Lab4 <= 100 && Lab4 >= 90) {
                Lab4_Grade = 10;
            } else if (Lab4 <= 90 && Lab4 >= 80) {
                Lab4_Grade = 9;
            } else if (Lab4 <= 80 && Lab4 >= 70) {
                Lab4_Grade = 8;
            } else if (Lab4 <= 70 && Lab4 >= 60) {
                Lab4_Grade = 7;
            } else if (Lab4 <= 60 && Lab4 >= 50) {
                Lab4_Grade = 6;
            } else if (Lab4 <= 50 && Lab4 >= 40) {
                Lab4_Grade = 5;
            } else if (Lab4 < 40) {
                System.out.println("You have failed this lab");
                Lab4_Grade = 4;
            }

            if (Lab5 <= 100 && Lab5 >= 90) {
                Lab5_Grade = 10;
            } else if (Lab5 <= 90 && Lab5 >= 80) {
                Lab5_Grade = 9;
            } else if (Lab5 <= 80 && Lab5 >= 70) {
                Lab5_Grade = 8;
            } else if (Lab5 <= 70 && Lab5 >= 60) {
                Lab5_Grade = 7;
            } else if (Lab5 <= 60 && Lab5 >= 50) {
                Lab5_Grade = 6;
            } else if (Lab5 <= 50 && Lab5 >= 40) {
                Lab5_Grade = 5;
            } else if (Lab5 < 40) {
                System.out.println("You have failed this lab");
                Lab5_Grade = 4;
            }

            int Lab1_Total = Lab1_Grade * LabCredit;
            int Lab2_Total = Lab2_Grade * LabCredit2;
            int Lab3_Total = Lab3_Grade * LabCredit3;
            int Lab4_Total = Lab4_Grade * LabCredit4;
            int Lab5_Total = Lab5_Grade * LabCredit5;

            float LabMarkTotal = Lab1_Total + Lab2_Total + Lab3_Total + Lab4_Total + Lab5_Total;
            float LabCreditTotal = LabCredit + LabCredit2 + LabCredit3 + LabCredit4 + LabCredit5;

            float LabRESULT = LabMarkTotal / LabCreditTotal;

            System.out.println("Your lab SGPA is " + LabRESULT);

            float finalLAB = (FinalMarks + LabMarkTotal) / (CreditSUM + LabCreditTotal);
            System.out.println("Your final SGPA is " + finalLAB);
        }

    }

