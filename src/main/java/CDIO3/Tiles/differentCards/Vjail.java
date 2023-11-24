
package CDIO3.Tiles.differentCards;


import CDIO3.Player.Player;
import CDIO3.Tiles.Board;
import CDIO3.Tiles.Color;
import CDIO3.Tiles.Tile;
import CDIO3.lang.Lang;

public class Vjail extends Tile{

    public Vjail(int tileNR) {
        super(Color.special, Lang.getSring(20), tileNR, 0, -1);
    }

    @Override
    public void landOn(Player[] players, int currentplayer, Board table) {
        players[currentplayer].getPiece().setPosition(18);
    }
   
}