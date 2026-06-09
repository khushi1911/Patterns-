import java.util.*;
//inverted half pyramid
public class inv_half_pyra {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter rows :");
        int n = sc.nextInt();
        

        for (int i=n ; i>=1 ; i--){
            for (int j=1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
