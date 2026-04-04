package OOPS;

import java.util.Scanner;

class Student{
        private  int marks;

        public void setMarks(int marks){
            if(marks>=0 && marks<=100){
                this.marks=marks;
            }
            else{
                System.out.println("Invalid Marks please enter [0-100]");
            }
        }
        public int  getMarks(){
            return marks;
        }
    }
    public class Enacapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("Enter marks");
        s.setMarks(sc.nextInt());
        System.out.println(s.getMarks());
        sc.close();
    }
}
