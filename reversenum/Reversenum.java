package reversenum;

public class Reversenum
{
    static int result;
    public static int reverse(int n)
    {
        
      int reversed = 0;
       while(n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return reversed;
    }
}
