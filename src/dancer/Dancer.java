package dancer;

import outfit.Costume;
import shoes.DanceShoes;

public class Dancer {
    private String name;
    private DanceShoes danceShoes;
	private Costume costume;
    
    public Dancer(String name, DanceShoes danceShoes, Costume costume){
    	this.setName(name);
    	this.setDanceShoes(danceShoes);
    	this.costume = costume;

    	System.out.println("Hello I am " + name);
    }


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DanceShoes getDanceShoes() {
		return danceShoes;
	}
	
	public void setDanceShoes(DanceShoes danceShoes){
		this.danceShoes = danceShoes;
	}


	public Costume getCostume() {
		new Costume(this.danceShoes);
		return costume;
	}




}
