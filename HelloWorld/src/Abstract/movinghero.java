package Abstract;

public class movinghero extends Movingobject{
	public double width,height;
	public movinghero(double w,double h) {
		this.width=w;
		this.height=h;
	}
	@Override
	public void Move(int buttomPressed) {
	 switch ( buttomPressed) {
		case 1:
			X -=5.0;
			break;
		case 2:
			X -=5.0;
			break;
		case 3:
			Y -=4.0;
			break;
		case 4:
			Y +=4.0;
			break;
		}
	}
	@Override
	public void Draw() {
		System.out.print("   *   " +"\n");
		System.out.print(" * * *"+"\n");
		System.out.print("   *   "+"\n");
		System.out.print("   *   "+"\n");
		System.out.print("  * *  "+"\n");
		System.out.print(" *   * "+"\n");
	
	}
	
}
