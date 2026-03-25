package ConstructorPrograms;

class Student{
    int id;
    String name;
    Student(String name, int id){
        this.name=name;
        this.id=id;
    }
    void display(){
            System.out.println("Student :" + name +"  "+ id);  
    }
  }
  class Teacher{
    int id;
    String name;
    double salary;
    Teacher(String name , int id , double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void display(){
        System.out.println("Teachers :"+ name +" "+ id+" "+ salary);
    }
  }
  class Classroom{
    Student student;
    Teacher teacher;
    Classroom(Student student,Teacher teacher){
        this.student=student;
        this.teacher=teacher;
    }
    void display(){
        System.out.println("Classroom Details");
        student.display();
        teacher.display();
    }
  }
  public class Main{

    public static void main(String[] args) {
        Student s1 =new Student("Shivashankar",119);
        Teacher t1 = new Teacher("Bhavana",101,70000.00);
        Classroom c1 = new Classroom(s1, t1);
        c1.display();
    }

  }

  





