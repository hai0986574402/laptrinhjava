package JavaInterface;
import java.util.Scanner;
import java.text.DecimalFormat;

public class HTHANG implements Figure1 
{
	public double a;
	public double b;
	public double c;
	public double d;
	public double h;
	public HTHANG()
	{
		a=a;
		b=b;
		c=c;
		d=d;
		h=h;
	}
	public double calS()
	{
		return (this.a+this.b)*this.h/2;
	}
	public double calP()
	{
		return this.a+this.b+this.c+this.d;
	}
	public void output()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chiều dài đáy a: ");
		a = scanner.nextDouble();
	    System.out.println("Nhập chiều dài đáy b: ");
	    b = scanner.nextDouble();
	    System.out.println("Nhập chiều dài đáy c: ");
	    c = scanner.nextDouble();
	    System.out.println("Nhập chiều dài đáy d: ");
	    d = scanner.nextDouble();
	    System.out.println("Nhập chiều cao h: ");
	    h = scanner.nextDouble();
		System.out.println("Diện tích là:" +calS());
		System.out.println("Chu vi là:" +calP());
		scanner.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HTHANG hinh = new HTHANG();
		hinh.output();
	}

}
