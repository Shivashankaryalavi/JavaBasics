package OOPS;
import java.util.Scanner;

class Student{
    String name;
    int id;
    int rollno;

 Student(String name,int id,int rollno){
    this.name= name;
    this.id= id;
    this.rollno = rollno;  
 }
 void display(){
        System.out.println("Id"+id+"name"+name+"rollno"+rollno);
    }
}

public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student [] stud = new Student[20];
        int count =0;
        while(true){
            System.out.println(" 1.Enter a studentds detail");
            System.out.println("2.Display");
            System.out.println("3.Search by id");
            System.out.println("Existing");
            System.out.println("Enter choice");
            int choice = sc.nextInt();

            switch(choice){
                case 1: 
                      if(count<stud.length){
                        System.out.println("Enter Id:");
                        int Id = sc.nextInt();

                        System.out.println("Enter name :");
                        String name = sc.next();

                        System.out.println("Enter roll no");
                        int rollno = sc.nextInt();

                        stud[count]= new Student(name, Id, rollno);
                        count++;

                        System.out.println("Student added succesfully");
                      }
                      else{
                        System.out.println("storage full");
                      }
                      break;
                case 2:
                      if(count ==0){
                        System.out.println("No students Available ");
                      }else{
                        for(int i =0;i<count ;i++){
                            stud[i].display();
                        }
                      }
                      break;
                case 3:
                    System.out.println("Search student");
                    int searchId=sc.nextInt();
                    boolean found = false;
                    for(int i =0;i<count;i++){
                        if(stud[i].id==searchId){
                           stud[i].display();
                           found = true;
                           break;
                        }
                    }
                    if(!found){
                        System.out.println("Students not found");
                    }
                    break;
                default :
                      System.out.println("Invalid choice");
            } 
            sc.close();    
        }
        
    
    }
  
    
}
