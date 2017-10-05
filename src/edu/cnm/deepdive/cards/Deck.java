package edu.cnm.deepdive.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Deck {

  private List<Card> cards;
  private Random rng = new Random();
  //Constructor ; Note: matches class name

  public Deck() {
    cards = new ArrayList<>();
    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        Card card = new Card(suit, rank);
        cards.add(card);
      }

    }
  }

  @Override
  public String toString() {
    return cards.toString();
  }

  //taking cards and giving you a different structer of card.
  public Card[] toArray() {
    return cards.toArray(new Card[0]);
  }

  public void shuffle() {
    Collections.shuffle(cards);
  }

  //public void sort() {
    //how many elements in the array
    //sort(0, cards.size());
    //Java will do sort
    //Collections.sort(cards);
  //sort is overloaded
    public void sort(Comparator<Card> comp) {
    Collections.sort(cards, comp);
  }
  public void sort() {
    Collections.sort(cards);
  }


  private void sort(int start, int end) {
    if (end <= start + 1) {
      return;
    }
    int pivotSource = start + rng.nextInt(end - start);
    //3rd holding
    Card pivotCard = cards.get(pivotSource);
    cards.set(pivotSource, cards.get(start));
    cards.set(start, pivotCard);
    //pivot card
    int i = start;
    int j = end;
    //markers cross over
    while (true) {
      try {
        //Is the card at positon less than pivot card? If so do nothing otherwise
        while (++i < end && cards.get(i).compareTo(pivotCard) < 0) {
          //do nothing
        }
        //move right counter down
        while (cards.get(--j).compareTo(pivotCard) > 0) {
          //do nothing
        }
      } catch (Exception e) {
        throw e;

      }
      if (j > i) {
        //Flip cards
        Card temp = cards.get(i);
        cards.set(i, cards.get(j));
        cards.set(j, temp);
      } else if (j < i) {

        Card temp = cards.get(j);
        cards.set(j, pivotCard);
        cards.set(start, temp);
        break;
      }
    }
    //the divide
    sort(start, j);
    sort(j + 1, end);
  }
}
