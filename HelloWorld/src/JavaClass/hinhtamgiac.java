package JavaClass;

import java.util.Scanner;

public class hinhtamgiac extends Figure
{
	public double AB;
	public double BC;
	public double AC;
	public double h;
	public hinhtamgiac()
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
	    super.S=(this.BC/2)*this.h;
	    super.P=this.AB+this.AC+this.BC;
	    scanner.close();
	}
	
	public static void main(String[] args)
	{	
		hinhtamgiac hinh = new hinhtamgiac();
		hinh.output();

		
	}

}
