package JavaInterface;
import java.util.Scanner;
import java.text.DecimalFormat;


public class HT implements Figure1
{
	public double r;
	public static final float PI = 3.14f;
	public HT()
	{
		r=r;
	}
	public double calS()
	{
		return ((this.r)*this.r)*PI;
	}
	public double calP()
	{
		return this.r*2*PI;
	}
	public void output()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào bán kính : ");
	    r = scanner.nextDouble();
	    System.out.println("Diện tích là:" +calS());
		System.out.println("Chu vi là:" +calP());
		scanner.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HT hinh = new HT();
		hinh.output();

	}

}
