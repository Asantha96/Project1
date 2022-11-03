class Fibbonanci {
    public static void findFibbonanceSeriesUpTo(int num){
        int num1=0, num2=1,fib=0;
        do {
            System.out.println(fib);
            num1=num2;
            num2=fib;
            fib = num1 + num2;
        } while (fib <= num);
    }
    public static void main(String[] args) {
        findFibbonanceSeriesUpTo(1000);
    }
}
