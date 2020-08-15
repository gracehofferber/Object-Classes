/*
Grace Hofferber
Jennifer Burg
CSC 111
28.3.18

This class has getters and setters for a Student's id, last name, gpa, tuition and payment.
This method also calculates the students gpa and calculates the tuition.

*/

package com.company;

import java.util.Scanner;

public class Student {
        private int studentID;
        private String lastName;
        private double studentGPA;
        private double tuition;
        private boolean paid;
        private int numCourses;
        private double[] courseGrades;
        private double[] courseHours;

        //constructor method
        public Student(){
            int id = 0;
            studentID = id;
            String lN = "";
            lastName = lN;
            double gpa = 0.0;
            studentGPA = gpa;
            double t = 0.0;
            tuition = t;
            boolean p = false;
            paid = p;
            int nC = 0;
            numCourses = nC;
            double[] cG = new double[10];
            courseGrades = cG;
            for(int i = 0; i < 10 ; i++){
                courseGrades[i] = 0;
            }
            double[] cH = new double[20];
            courseHours = cH;
            for(int j = 0; j < 20; j++){
                courseHours[j] = 0;
            }
        }

        public void set_ID(int id){
            studentID = id;

        }
        public int get_ID(){
            return studentID;
        }
        public void set_lastname(String lN){
            lastName = lN;

        }
        public String get_lastname(){
            return lastName;
        }
        public void set_GPA(double gpa){
            studentGPA = gpa;

        }
        public double get_GPA(){
            return studentGPA;
        }
        public void set_tuition(double t){
            tuition = t;

        }
        public double get_tuition(){
            return tuition;
        }
        public void set_numCourses(int nC){
            numCourses= nC;

        }
        public int get_numCourses() {
            return numCourses;
        }
        public void set_paid(boolean p){
            paid = p;
            return;
        }
        public void get_paid(){
            System.out.println("true");
        }
        public void addCourseGrade(){
            Scanner scnr = new Scanner(System.in);
            String lettergrade = "";
            double classvalue = 0;
            for(int i = 0; i < numCourses; i ++) {
                System.out.println("Please enter the grade of each class. One at a time.(A,A-,B+,B,B-" +
                        ",C+,C,D+,D,F)");
                String grade = scnr.next();
                if (grade.equals("A")) {
                    classvalue = 4.00;
                } else if (grade.equals("A-")) {
                    classvalue = 3.50;
                } else if (grade.equals("B+")) {
                    classvalue = 3.00;
                } else if (grade.equals("B")) {
                    classvalue = 2.50;
                } else if (grade.equals("B-")) {
                    classvalue = 2.5;
                } else if (grade.equals("C+")) {
                    classvalue = 2.00;
                } else if (grade.equals("C")) {
                    classvalue = 1.50;
                } else if (grade.equals("D+")) {
                    classvalue = 1.00;
                }else if(grade.equals("D")){
                    classvalue = 0.05;
                } else if (grade.equals("F")) {
                    classvalue = 0.00;
                } else {
                    System.out.println("Invalid Grade.");
                }
              courseGrades[i] = classvalue;
            }
            for(int j = 0; j < numCourses; j++) {
                System.out.println("Please enter the number of credits for each class. Enter one of the following: 0.5, 1.0, 1.5, 2.0, 2.5 or 3.0");
                double credithrs = scnr.nextDouble();
                if (credithrs == 0.5) {
                    courseHours[j] = 0.5;
                }
                else if (credithrs == 1.0) {
                    courseHours[j] = 1.0;
                }
               else if(credithrs == 1.5) {
                    courseHours[j] = 1.5;
                }
                else if(credithrs == 2.0) {
                    courseHours[j] = 2.0;
                }
                else if (credithrs == 2.5) {
                    courseHours[j] = 2.5;
                }
                else if (credithrs == 3.0) {
                    courseHours[j] = 3.0;
                }
            }
        }

        public void computeGPA(){
            double totalhrs = 0.0;
            double sumclass = 0.0;
            for(int i = 0; i < numCourses; i++){ //GPA calculator
                totalhrs = totalhrs+ courseHours[i];// total number of credits.
                sumclass = sumclass + courseHours[i] * courseGrades[i];
            }
            double totalgpa = sumclass / totalhrs;
            System.out.println("The students gpa is: " + totalgpa);
        }

        public void final_tuition(){
            double sumtuition = 0.0;
            for(int i = 0; i < numCourses; i++) { //GPA calculator
                sumtuition = sumtuition + courseHours[i] * 4000 ;// total number of credits.
            }
            System.out.println("The students tuition is: " + sumtuition);
        }


    }//end of Student
