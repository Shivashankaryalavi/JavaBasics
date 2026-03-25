

public class Student {

    int id;
    String name;
    Student(){
        int num= 30;
        System.out.println("Hello student");
        System.out.println(num);

    }
  
    public static void main(String[] args) {
        Student s = new Student();
        s.id=20;
        s.name="Shivashankar";
        
        System.out.println(s.id);
        System.out.println(s.name);
    }
    
}
