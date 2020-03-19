public class PrimeNumberBelow100 {
    public static void main(String[] args)
    {
        boolean check=false;

        StringBuilder result=new StringBuilder();

        for (int i=2; i<100; i++)
        {
            check = PrimeNumberCheck(i);
            if (check)
            {
                result.append(" ").append(i);
            }
        }
        System.out.print("Cac so nguyen to < 100: "+result);
    }

    public static boolean PrimeNumberCheck(int number)
    {
        if (number<2)
        {
            return false;
        }
        else
        {
            for (int i=2; i<number-1; i++)
            {
                if (number%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
}
