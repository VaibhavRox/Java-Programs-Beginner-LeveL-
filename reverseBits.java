public class reverseBits {
    public static int reverse(int n)
    {
        int reversed=0;
        for(int i=0;i<32;i++)
        {
            reversed=reversed<<1;
            if((n&1)==1)
            {
                reversed=reversed^1;
            }
            n>>=1;
            
        }
        return reversed;
    }
    public static void main(String[] args) {
        int number = 10; // Example number
        System.out.println("Original number: " + number);
        int reversedNumber = reverse(number);
        System.out.println("Reversed bits: " + reversedNumber);
    }
}
