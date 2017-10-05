package edu.cnm.deepdive.cards;

import java.util.Comparator;

public class Test {

  public static void main(String[] args) {
    // Local class
//    class AlternateSorter implements Comparator<Card> {
//
//      @Override
//      public int compare(Card card1, Card card2) {
//        if (card1.rank != card2.rank) {
//          return card1.rank.compareTo(card2.rank);
//        }
//        return card1.suit.compareTo(card2.suit);
//      }
//    }

    Deck deck = new Deck();
    deck.shuffle();

    System.out.println(deck);
    deck.sort();
    System.out.println(deck);
    //takes default constructor
    //Anonymous class
    deck.sort(new Comparator<Card>() {
      @Override
      public int compare(Card card1, Card card2) {
        if (card1.rank != card2.rank) {
          return card1.rank.compareTo(card2.rank);
        }
        return card1.suit.compareTo(card2.suit);
      }
    });
    System.out.println(deck);
  }
}
//Top-level (non-public)  class
//private static class AlternateSorter implements Comparator<Card> {
//for compartor if
//  @Override
// public int compare(Card card1, Card card2) {
//   if (card1.rank != card2.rank)
//    {      return card1.rank.compareTo(card2.rank);
//   }
//   return card1.suit.compareTo(card2.suit);
// }
//}
//}
