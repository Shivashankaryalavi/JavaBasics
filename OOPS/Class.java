package OOPS;

public class Class {
    String name;
    int id;
    int rollno;

    Class(int id,String name,int rollno){
        this.name=name;
        this.id=id;
        this.rollno=rollno;
    }
    public static void main(String[] args) {
        Class stud1 = new Class(1, "Shiva", 119);
        Class stud2 = new Class(2, "Shivu", 120);

        
    }
}
