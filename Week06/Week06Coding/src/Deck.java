import java.util.ArrayList;
import java.util.Collections;

public class Deck {
  ArrayList<Card> theDeck = new ArrayList<Card>();

  private static final String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

  private static final String[] names = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
      "Jack", "Queen", "King", "Ace" };

  // constructor:
  public Deck() {
    this.createDeck();
  }

  // method draw
  public Card deckDraws() {
    Card drawCard = this.theDeck.get(0);
    this.theDeck.remove(0);
    System.out.println(drawCard.describeCard());
    return drawCard;
  }

  // method createDeck
  public void createDeck() {
    for (String suit : suits) {
      for (int i = 2; i <= 14; i++) {
        String cardName = names[i - 2] + " of " + suit;
        Card card = new Card(i, cardName);
        this.theDeck.add(card);
      }
    }
  }

  // shuffle
  public void shuffle() {
    {
      Collections.shuffle(this.theDeck);
    }

  }
}