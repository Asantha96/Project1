import java.util.*;

class Q279 {
    public static boolean isEven(int number){
        boolean isEvenNumber =false;
        if ((number%2)==0) {
            isEvenNumber =true;
        }
        return isEvenNumber;
    }
    public static void main(String args[]) {
        // Scanner input=new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int rand = r.nextInt(101); // 0 to 100
            System.out.println(rand + " : " + (isEven(rand) ? "even" : "Odd"));
        }
    }
}
