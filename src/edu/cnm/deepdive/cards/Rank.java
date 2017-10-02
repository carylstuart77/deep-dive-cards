package edu.cnm.deepdive.cards;

public enum Rank {
  ACE(1,15),
  TWO(2,5),
  THREE(3,5),
  FOUR(4,5),
  FIVE(5,5),
  SIX(6,5),
  SEVEN(7,5),
  EIGHT(8,5),
  NINE(9,5),
  TEN(10,10),
  JACK(11,10),
  QUEEN(12,10),
  KING(13,10);

  //don't change after it is assigned; card does not change ones printed.
  //
  public final int pips;
  public final int value;
  //constructor needs to be private cuz no other can create instances of this
  //private is assumed
  Rank(int pips, int value){
    this.pips = pips;
    this.value = value;
  }

  @Override
  public String toString() {
    if (pips > 1 && pips < 11) {
      return Integer.toString(pips);
      //return String.format("%d",pips);        could do it this way
    } else {
      //get the first letter of string
      return super.toString().substring(0, 1);
    }
  }
}
