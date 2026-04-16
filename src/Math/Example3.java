package Math;

class Example3
{
    //add all the digits of a number until a  single digit
    static int addDigits(int num) {
        int sum = 0;
        while (num > 0 || sum > 9) 
        {
            if (num == 0)
            {
                num = sum;
                sum = 0;
            }
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num));
    }
}