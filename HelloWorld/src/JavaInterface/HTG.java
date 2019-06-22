package JavaInterface;

import java.util.Scanner;

public class HTG implements Figure1
{
	public double AB;
	public double BC;
	public double AC;
	public double h;
	public HTG()
	{
		AB=AB;
		BC=BC;
		AC=AC;
		h=h;
	}
	public double calS()
	{
		return (this.BC/2)*this.h;
	}
	public double calP()
	{
		return this.AB+this.AC+this.BC;
	}
	public void output()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập cạnh AB: ");
	    AB = scanner.nextDouble();
	    System.out.println("Nhập cạnh BC: ");
	    BC = scanner.nextDouble();
	    System.out.println("Nhập cạnh AC: ");
	    AC = scanner.nextDouble();
	    System.out.println("Nhập chiều cao h: ");
	    h = scanner.nextDouble();
		System.out.println("Diện tích là:" +calS());
		System.out.println("Chu vi là:" +calP());
		scanner.close();
	}
	
	public static void main(String[] args)
	{	
		HTG hinh = new HTG();
		hinh.output();

		
	}

}
