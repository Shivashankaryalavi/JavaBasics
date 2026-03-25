package Constructor;


public class Classroom {
    String studentName;
    int studentId;
    String teacherName;
    int teacherId;
    double teacherSalary;

    Classroom(String studentName,int studentId){
        System.out.println("Students Detail");
        this.studentName=studentName;
        this.studentId=studentId;
  
        

    }
    

    Classroom(String teacherName,int teacherId,double teacherSalary){
        System.out.println("Teachers Detail");
        this.teacherName=teacherName;
        this.teacherId=teacherId;
        this.teacherSalary=teacherSalary;

    }
    public static void main(String[] args) {
        Classroom s1 = new Classroom("Shivanand", 420);
        System.out.println(s1.studentName +" "+ s1.studentId);

        Classroom t1 = new Classroom("Trainer",110,25000.00);
        System.out.println(t1.teacherName+" "+ t1.teacherId+" "+t1.teacherSalary);
    }

    
}
