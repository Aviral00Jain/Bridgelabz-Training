import java.util.Scanner;

class DeckOfCards {

    // fixed suits and ranks
    static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static final String[] RANKS = {
        "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "Jack", "Queen", "King", "Ace"
    };

    // initialize deck
    public static String[] initializeDeck() {

        int numOfCards = SUITS.length * RANKS.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (int i = 0; i < SUITS.length; i++) {
            for (int j = 0; j < RANKS.length; j++) {
                deck[index++] = RANKS[j] + " of " + SUITS[i];
            }
        }
        return deck;
    }

    // shuffle deck
    public static void shuffleDeck(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {

            int randomCardNumber =
                i + (int) (Math.random() * (n - i));

            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // distribute cards to players
    public static String[][] distributeCards(String[] deck,
                                              int totalCards,
                                              int players) {

        if (totalCards % players != 0) {
            return null;
        }

        int cardsPerPlayer = totalCards / players;
        String[][] playerCards = new String[players][cardsPerPlayer];

        int cardIndex = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[cardIndex++];
            }
        }
        return playerCards;
    }

    // print players and their cards
    public static void printPlayers(String[][] players) {

        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + " cards:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        // creating scanner object
        Scanner sc = new Scanner(System.in);

        // initialize and shuffle deck
        String[] deck = initializeDeck();
        shuffleDeck(deck);

        // taking user input
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter number of cards to distribute ");
        int totalCards = sc.nextInt();

        // distribute
        String[][] result = distributeCards(deck, totalCards, players);

        if (result == null) {
            System.out.println(
                "Cards cannot be distributed equally among players.");
        } else {
            printPlayers(result);
        }
    }
}