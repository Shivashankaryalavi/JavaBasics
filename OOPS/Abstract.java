package OOPS;

abstract class Add{
    abstract int add(int a, int b);
}
 abstract class Task extends Add{
       abstract void task();
}
class Solution extends Task{
    int add(int a,int b){
        return a+b;
    }
    void task(){
        System.out.println("Perform addition");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Solution  s =new Solution();
        System.out.println(s.add(5, 2));
        s.task();
    }
    
}
