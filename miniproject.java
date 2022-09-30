/**
 * miniproject
 */
import java.util.Scanner;
public class miniproject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mynumber = (int)(Math.random()*100);
        int usernumber = 0;
        do {
            System.out.println("guess mynumber(1-100): ");
            usernumber = sc.nextInt();
            if(usernumber==mynumber){
                System.out.println("correct number");
                break;
            }else if (usernumber>mynumber) {
                System.out.println("number is too large");
            } else {
                System.out.println("number is too small");
            }
        } while (usernumber>=0);
        System.out.print("mynumber was: ");
        System.out.println(mynumber);
    }
}