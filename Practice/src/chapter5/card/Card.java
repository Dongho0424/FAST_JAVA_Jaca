package chapter5.card;

public class Card {

    private static int serialNum  = 10000;
    private int cardNum ;

    public Card() {
        serialNum++;
        cardNum = serialNum;
    }

    public int getCardNumber(){
        return cardNum;
    }



}
