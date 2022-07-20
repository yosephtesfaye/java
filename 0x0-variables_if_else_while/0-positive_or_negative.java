
import java.util.Random;
class PositiveOrNegative
{
	public static void main(String[] args) {
		Random r = new Random();

		int n = r.nextInt();

		if(n >0)
			System.out.println("positive");
		else if(n==0)
			System.out.println("Zero");
		else
			System.out.println("Negative");
	}
}