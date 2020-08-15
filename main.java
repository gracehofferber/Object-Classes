/*
Grace Hofferber
Jennifer Burg
CSC 111
28.3.18

In the main method, the program will call the method's from the Student class and asks the user to send in
 information to the student class.

*/


package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Student s = new Student();//calls constructor
	    Scanner scnr = new Scanner(System.in);
	    System.out.println("Please enter your student id");
	    int ID = scnr.nextInt();
	    s.set_ID(ID);
	    System.out.println("The student id is: 0" + s.get_ID());
	    System.out.println("Please enter your last name.");
	    String last = scnr.next();
	    s.set_lastname(last);
	    System.out.println("Student's lastname: " + s.get_lastname());
	    System.out.println("Please enter the number of courses your taking");
	    int course = scnr.nextInt();
	    s.set_numCourses(course);
	    System.out.println("The number of courses the student is taking is: " + s.get_numCourses());
	    s.addCourseGrade();
	    s.computeGPA();
	    s.final_tuition();
	    s.get_paid();

        }
    }



