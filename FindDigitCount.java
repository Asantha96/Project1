import java.util.*;
public class FindDigitCount {
    public static int findDigitCount(int value){
        int counter =0;
        do {
            value /= 10;
            counter++;

        } while (value != 0);
        return counter;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println(findDigitCount(num));
        
    }
}
