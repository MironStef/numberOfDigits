import java.util.Scanner;

public class numberOfDigits {

    static int numberOfDigits (long n)
    {
        int count = 0;
        while (n != 0){
            n = n/10;
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner yourNumber = new Scanner(System.in);
        System.out.println("Choose your number");
        long n = yourNumber.nextLong();
        System.out.println("Number of digits:" + " " + numberOfDigits(n));
    }
}


