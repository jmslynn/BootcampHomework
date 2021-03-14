
public class App {
    public static void main(String[] args) {

        // create a deck
        Deck deck = new Deck();
        deck.shuffle();

        // create 2 players
        Player player1 = new Player("Bill");
        Player player2 = new Player("Emsley");

        // Deal game with traditional for loop and Draw method
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.playerDraws(deck);
            } else {
                player2.playerDraws(deck);
            }
        }
        // play game
        for (int x = 0; x < 26; x++) {
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();
            System.out
                    .println("player1 value: " + player1Card.getValue() + " player2 value: " + player2Card.getValue());

            if (player1Card.getValue() > player2Card.getValue()) {
                player1.incrementScore();
            } else if (player1Card.getValue() < player2Card.getValue()) {
                player2.incrementScore();
            } else {
                continue;
            }

        }

        // Print score if else
        if (player1.score > player2.score) {

            System.out.println("player1 wins!");
        } else if (player2.score > player1.score) {
            System.out.println("player2 wins!");
        } else {
            System.out.println("it's a draw!");
        } // closes socre

    }
}
