package CDIO3.TUI;

import CDIO3.Tiles.Tile;

public class MiddlePiece {
  public String[] pieceLines;
  final static private String 
  owner = "\uE005";
  public MiddlePiece(Tile tile) {
    pieceLines = generate(tile);
  }
  private String[] generate(Tile tile){
    String[] lines = new String[4];
    lines[0] = "┌" + "\u2015".repeat(6) + "┐";
    lines[1] = "|\u001b[38;5;" + tile.getColor().ansi + "m" + "\u2588".repeat(6) + tile.getColor().resetAnsi + "|";
    lines[2] = "|" + "\u2015".repeat(2) + "┬" + "\u2015".repeat(3) + "|";
    String tileNR = tile.getNumber() + ""; tileNR += tileNR.length() < 2 ? " " : "";
    lines[3] = "|" + owner.repeat(2) + "|#" + tileNR + "|";
    return lines;
  }
}
