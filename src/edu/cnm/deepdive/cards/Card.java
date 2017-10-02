package edu.cnm.deepdive.cards;

public class Card
  implements Comparable<Card> {


  public final Suit suit;
  public final Rank rank;

  //constructor is names the SAME as class
  public Card(Suit suit, Rank rank) {
    //assign the suit and assign it to the FIELD call suit
    //assign the rank and assign it to the FIELD call rank
    this.suit = suit;
    this.rank = rank;

  }

  @Override
  public String toString() {
    return rank.toString() + suit.toString();
  }

  @Override
  public int compareTo(Card other) {
    if (suit != other.suit)
    {      return suit.compareTo(other.suit);
  }
  return rank.compareTo(other.rank);



}
}


