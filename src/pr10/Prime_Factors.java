package pr10;

public class Prime_Factors {
    public static void prime_Factors(int a, int divisor){
        if(a <= 1){
            return;
        }
        if (divisor>a){
            return;
        }
        if (isPrime(divisor) && a%divisor==0){
            System.out.print(divisor + " ");
            prime_Factors(a/divisor, divisor+1);
        }
        else{
            prime_Factors(a, divisor+1);
        }
    }
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2; i*i<=num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
