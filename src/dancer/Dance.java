import shoes.PointeShoes;
import music.Classical;
import costume.Tutu;
import place.Stage;

public class Dance {

	public static void main(String[] args){
		PointeShoes pointeShoes = new PointeShoes();
		Tutu tutu = new Tutu();
        Classical classical = new Classical();
		Stage stage = new Stage();
        String myShoes = pointeShoes.makeNoise();
		String myDress = tutu.whatAmIWearing();
		String mySong = classical.isPlaying();
		String mySpace = stage.whereAmI();
		System.out.println(myShoes);
		System.out.println(myDress);
		System.out.println(mySong);
		System.out.println(mySpace);
	}
	
}