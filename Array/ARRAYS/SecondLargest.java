package ARRAYS;

public class SecondLargest {

    public static void main(String[] args) {
        int marks[]={10,20,53,56,89,48,99,100};
        int max = Integer.MIN_VALUE;
        int secondmax =Integer.MIN_VALUE;

        for(int element :marks){
            if(element>max){
                 secondmax=max;
                 max=element;
            }
            else if(element>secondmax && element<max){
                secondmax=element;
            }
           
        }
        if(secondmax==Integer.MIN_VALUE){
            System.out.println("No second largest ");
        }
        else{
            System.out.println("Second Maximum " + secondmax);
        }
       
    }
}