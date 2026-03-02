import java.util.*;
class pp31
{
    static void main()
    {
        double celsius,farenheitResult;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the degree Celsius");
        celsius =sc.nextDouble();
        farenheitResult=(celsius*(9/5))+32;
        System.out.println("The "+celsius+" celsius is "+farenheitResult+" fahrenheit");
    }
}