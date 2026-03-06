package Methods;
public class Print1to10 {

    public static void print1to10(){
        for(int i=1;i<=10;i++){
        
            System.out.print(i);
            if(i==10)continue;
            System.out.print(" ,");
           

        }

    }
    public static void main(String[] args) {
        print1to10();
    }
}