class FactorialMethod {
    public static int FindFactorial(int num){
        int fact=1;
        for (int i = 1; i <= num; i++) {
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i+" ! = "+FindFactorial(i));
        }
        
    }
}
