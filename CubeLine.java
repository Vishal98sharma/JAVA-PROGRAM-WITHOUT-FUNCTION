import java.util.Scanner;
class CubeLine{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==0)
                System.out.print("*");
                else if(j==n-1)
                System.out.print("*");
                else if (i==n-1)
                System.out.print("*");
                else if(j==0)
                System.out.print("*");
                else if(i==j)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println("");

        }
    }
}