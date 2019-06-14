package JavaHam;

import java.util.Random;

public class VD4 {
	public static  float getRandomNumber()
	{
		float result;
		Random r = new Random();
		result = r.nextFloat();
		System.out.println("Số vừa được sinh ra là " + result);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 getRandomNumber();
		 getRandomNumber();
		 getRandomNumber();
	}

}
