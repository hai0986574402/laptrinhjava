package Abstract;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movingobject ball = new movingball();
		ball.Move(1);
		ball.Draw();
		Movingobject hero = new movinghero(2,5);
		hero.Move(3);
		hero.Draw();
	}

}
