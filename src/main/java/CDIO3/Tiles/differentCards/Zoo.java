package CDIO3.Tiles.differentCards;


import CDIO3.Tiles.Color;
import CDIO3.Tiles.Tile;

public class Zoo extends Tile{

    public Zoo(int tileNR) {
        super(Color.brown, "The zoo", tileNR, 4, -1);
    }
    
    @Override
    public void landOn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'landOn'");
    }
}