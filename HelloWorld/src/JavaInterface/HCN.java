package JavaInterface;

import java.util.Scanner;

import JavaClass.hinhchunhat;

public class HCN implements Figure1 
{
	public double Dai;
	public double Rong;
	public HCN()
	{
		Dai = Dai;
		Rong =Rong;
		  
	}
	 	public double calS()
    {
    	return this.Dai*this.Rong;
    }
	 	public double calP()
    {
    	return (this.Dai+this.Rong)*2;
    }
	 	public void output()
		{
	 		Scanner scanner = new Scanner(System.in);
			System.out.println("Nhập chiều dài: ");
			Dai = scanner.nextDouble();
		    System.out.println("Nhập chiều rộng: ");
		    Rong = scanner.nextDouble();
			System.out.println("Diện tích là:" +calS());
			System.out.println("Chu vi là:" +calP());
			scanner.close();
		}
   
	public static void main(String[] args) {
		HCN hinh = new HCN();
		hinh.output();
	}

}
