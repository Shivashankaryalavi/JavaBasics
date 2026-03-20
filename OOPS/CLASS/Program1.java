package OOPS.CLASS;
class  Student{
    private String name;
    private int age;


 public void setDetails(String name,int age){
    this.name=name;
    this.age= age;
 }
 public String getName(){
    return name;
 }
 public int getAge(){
    return age;
 }
}
public class Program1 {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.setDetails("Shiva",25);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());

    }
}