public class MyClass{
    public static void main(String[] args) {
        Card card = new Card();
        card.name = "spaid";
        card.number = 9;
        Card card1 = new Card();
        card1.name = "heart";
        card1.number = 7;
        Card card2 = new Card();
        card2.name = "diamond";
        card2.number = 10;
        Card card3 = new Card();
        card3.name = "clover";
        card3.number = 2;
        String[] names = {"spaid", "heart", "diamond", "clover"};
        int[] numbers = {9, 7, 10, 2};
        Card[] cards = new Card[4];
        System.out.println(card1.toString());
        for (int i = 0; i < cards.length; i++) {
            Card card4 = new Card();
            card4.name = names[i];
            card4.number = numbers[i];
            cards[i] = card4;
        }
//1��.        for (int i = 0; i < cards.length; i++) {
//              System.out.println(cards[i].name + " " + cards[i].number);
//        }
        // foreach
        for (Card j : cards) {
            System.out.println(j.number + " " + j.name);
        }
    }
}
 class Card {
    String name;
    int number;
    public Card(String name,int number) {
    	this.name = name;
    	this.number = number;
    }
    public Card() {}
}