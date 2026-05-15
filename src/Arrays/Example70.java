package Arrays;

public class Example70
{
    public static void main(String[] args)
    {
        int r = 214;
        int count = 0;
        while(r!=0)
        {
            r = r/10;
            count++;
        }
        System.out.println(count);
    }
}
