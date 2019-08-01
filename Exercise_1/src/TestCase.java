import java.util.concurrent.ThreadLocalRandom;

public class TestCase {

	public static void main(String[] args) {

		//generate random ints in a range. 
		int n = ThreadLocalRandom.current().nextInt(0, 750); 

		if( n >=100 && n <=500) { 

			System.out.println("TestCase: Pass: " + n);

		} 
		else { 

			System.out.println("TestCase: Fail: " + n + " <Valus not within range of 100 - 500> "); 
		}


	} 
}
 
