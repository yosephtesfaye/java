
import java.util.Random;
class LastDigit
{
	public static void main(String[] args) {
		Random r = new Random();

		int n = r.nextInt();
		int lastDigit = n % 10;
		if(lastDigit >5)
			System.out.println("Last Digit of "+ n +" is greater than 5");
		else if(n==0)
			System.out.println("Last Digit of "+ n +" Zero");
		else
			System.out.println("Last Digit of "+ n +" is less than 6 and not 0");
	}
}