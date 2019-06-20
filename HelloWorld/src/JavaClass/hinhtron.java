package JavaClass;

import java.util.Scanner;
import java.text.DecimalFormat;

public class hinhtron extends Figure
{
	public double r;
	public static final float PI = 3.14f;
	public hinhtron()
	{
		r=r;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào bán kính : ");
	    r = scanner.nextDouble();
	    super.S=((this.r)*this.r)*PI;
	    super.P=this.r*2*PI; 
	    scanner.close();
	}
	public static void main(String[] args)
	{	
		hinhtron hinh = new hinhtron();
		hinh.output();

		
	}

}
