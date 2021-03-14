import java.util.ArrayList;

public class Player {

  // fields
  ArrayList<Card> hand = new ArrayList<Card>();
  // ArrayList<Card> hand2 = new ArrayList<Card>();

  int score;
  String name;

  // constructor
  public Player(String name) {
    this.score = 0;
    this.name = name;
  }

  // describe player
  public void describePlayer() {
    System.out.println(this.name + ": " + this.score + " points");
    for (Card card : hand) {
      card.describeCard();
    }
  }

  public Card flip() {
    Card myCard = this.hand.get(0);
    this.hand.remove(0);
    return myCard;
  }

  public void playerDraws(Deck deck) {
    this.hand.add(deck.deckDraws());
  }

  public void incrementScore() {
    this.score++;
  }
}
