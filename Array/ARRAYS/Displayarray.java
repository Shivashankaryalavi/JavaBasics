package ARRAYS;

public class Displayarray {
    static int[] returnArray(){
        int[] a = {1,2,3,4,5};
        return a;
        
    }
    public static void main(String[] args) {
        int[]  a = returnArray();
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
    
}
