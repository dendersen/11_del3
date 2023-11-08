package CDIO3.TUI;

import CDIO3.Tiles.Tile;

public class MiddlePiece implements BoardPiece{
  public String[] pieceLines;
  final private String 
  owner,
  horizontal = "\u2500",
  vertical = "\u2502",
  fullBlock = "\u2588";
  final static public int 
  width = 8,
  height = 4;

  public MiddlePiece(Tile tile) {
    owner = getOwnerUni(tile.getNumber());
    pieceLines = generate(tile);
  }
  private String[] generate(Tile tile){
    String[] lines = new String[4];
    
    //close top of box
    lines[0] = "┌" + horizontal.repeat(6) + "┐";
    
    //color of the tile
    lines[1] = vertical + "\u001b[38;5;" + tile.getColor().ansi + "m" + fullBlock.repeat(6) + tile.getColor().resetAnsi + vertical;
    
    //split into to sections
    lines[2] = "├" + horizontal.repeat(2) + "┬" + horizontal.repeat(3) + "┤";
    
    //find tile number and write in constant length
    String tileNR = tile.getNumber() + ""; tileNR += tileNR.length() < 2 ? " " : "";
    
    //write the owner and the tile number on the final tile
    lines[3] = vertical + owner.repeat(2) + vertical + "#" + tileNR + vertical;
    
    //return text
    return lines;
  }
  public String getLine(int lineID){
    if(lineID < 0 || lineID >= pieceLines.length) return "missing line"; 
    return pieceLines[lineID];
  }
  public String getOwnerUni(){
    return owner;
  }
  public String getOwnerUni(int tileNR){
    switch (tileNR) {
      case 0:
        return "\uE001";
      case 1:
        return "\uE002";
      case 2:
        return "\uE003";
      case 3:
        return "\uE004";
      case 4:
        return "\uE005";
      case 5:
        return "\uE006";
      case 6:
        return "\uE007";
      case 7:
        return "\uE008";
      case 8:
        return "\uE009";
      case 9:
        return "\uE00a";
      case 10:
        return "\uE00b";
      case 11:
        return "\uE00c";
      case 12:
        return "\uE00d";
      case 13:
        return "\uE00e";
      case 14:
        return "\uE00f";
      case 15:
        return "\uE010";
      case 16:
        return "\uE011";
      case 17:
        return "\uE012";
      case 18:
        return "\uE013";
      case 19:
        return "\uE014";
      case 20:
        return "\uE015";
      case 21:
        return "\uE016";
      case 22:
        return "\uE017";
      case 23:
        return "\uE018";
      default:
        return null;
    }
  }
}
