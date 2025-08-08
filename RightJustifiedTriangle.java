import java.util.Scanner;
public class RightJustifiedTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the hight of the triangle.");
        Scanner sc=new Scanner(System.in);
        int hight=sc.nextInt();
        for(int i=hight; i>=1; i--){
            for(int j=1; j<=hight; j++){
                if(i<=j) {
                    System.out.printf("%-3d",j);
                }
                    else{
                        System.out.print("   ");
                    }
                }
            System.out.println();
            }
        }
    }

