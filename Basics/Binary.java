package Basics;

public class Binary {
    public static void main(String[] args){
        int a1[] = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        int low = 0;
        int high = a1.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(a1[mid] == target){
                System.out.println("Element found at index "+mid);
                return;
            }
            else if(a1[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println("Element not found");
    }
}
