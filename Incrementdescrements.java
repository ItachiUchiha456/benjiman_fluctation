import java.util.Scanner;
public class Incrementdescrements {
    public static void main(String[] args) {
    Scanner u= new Scanner(System.in);
    System.out.print("Enter the benjamin fluctation number: ");
    int n = u.nextInt();
    System.out.println("The bulbs will fluctuate at: ");
    for(int i = 1; i<=n ; i++){
        for(int j = 1; j <= n ; j++){
            if(j%i == 0){
            System.out.print(j+" ");
            }
        }System.out.println();
    }
    }
}
