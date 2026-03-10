import java.util.Scanner;


class SumOfIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements ");
        for(int i =0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i =0;i<n;i++){
            if(i==1|| i==3){
                sum+=arr[i];
 
            }
        }
        System.out.println(sum);
    }
}