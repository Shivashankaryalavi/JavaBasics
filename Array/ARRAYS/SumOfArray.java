package ARRAYS;

public class SumOfArray {
    static void sum(int[] ar){
        int sum =0;
        for(int i =0;i<ar.length;i++){
            sum+=ar[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[] a = {1,2,3};
        sum(a);
        
    }
    
}
