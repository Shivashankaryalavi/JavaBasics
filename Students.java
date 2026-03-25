

public class Students {
    int id;
    String name;
    long ph_no;
    Students(){
        System.out.println("Hello Students");
    }
    Students(int id ,String name){
        this.id=id;
        this.name=name;
    }
    Students(int id,String name,long ph_no){
        this.id=id;
        this.name= name;
        this.ph_no=ph_no;
    }
    public static void main(String[] args) {
        Students s = new Students();

        Students s1 = new Students(101,"James");
        System.out.println(s1.id+" "+ s1.name);
        Students s2 = new Students(102,"Shiva",9731411037l);
        System.out.println(s2.id+" "+s2.name+" "+s2.ph_no);
    }
    
}
