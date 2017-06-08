package dance;

import dancer.Dancer;
import outfit.Costume;
import outfit.Tutu;
import shoes.BalletShoes;
import shoes.DanceShoes;
import shoes.PointeShoes;

public class Dance {

	public static void main(String[] args) {
		Dancer molly = new Dancer("Molly", new PointeShoes(), new Tutu());
        String mturn = molly.getDanceShoes().turn();
        System.out.println(mturn);


	}

}
