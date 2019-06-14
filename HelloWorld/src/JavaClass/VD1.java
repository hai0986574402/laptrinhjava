package JavaClass;

public class VD1 
{
	
	public float w,h;
	public VD1()
	{
		w = 0.0f;
		h = 0.0f;
	}
	public float calSquare()
	{
		return w*h;
	}	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		VD1 r;
		r = new VD1();
		r.w = 10.0f;
		r.h = 20.0f;
		float dt = r.calSquare();
		System.out.println("Diện tích của hình chữ nhật là:  " + dt);		
	}

}
