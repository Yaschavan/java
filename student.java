import java.util.Scanner;

 class Student
 {
   public static void main(String args[])
   { 
     int student_id;
     String student_name, student_attendence;
     System.out.println("Enter student name: ");
     Scanner sc = new Scanner(System.in);
     student_name = sc.next();
     System.out.println("Enter student attendence: ");
     student_attendence = sc.next();
     System.out.println("Enter student id: ");
     student_id = sc.nextInt();
     System.out.println("Student Name: "+student_name);
     System.out.println("Student attendence: "+student_attendence);
     System.out.println("Student id: "+student_id);
    
   }
 }
