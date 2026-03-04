package Methods;
public class Student {
    public static void Student1(String name,long num,int id){
             System.out.println( name + " "+ num + " "+ id);
    }
    public static void Student1(String name, int id){
             System.out.println(  name + " "+ id);
    }

    public static void main(String[] args) {
      Student1("Shiva", 9731411037l,119);  
      Student1("Shankar" , 119);

    }
}