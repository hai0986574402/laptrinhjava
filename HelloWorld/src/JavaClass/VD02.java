package JavaClass;

class VD2 
{
	private float w,h;
	public void setEdges(float W, float H)
	{
		w = W;
		h = H;
	}
	public float calSquare()
	{
		return w*h;
	}
}

public class VD02
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		{
			VD2 r;
			r = new VD2();
			r . setEdges(100.0f,200.0f);
			float dt = r.calSquare();
			System.out.println("Diện tích của hình chữ nhật là:  " + dt);
		}

	}

}
