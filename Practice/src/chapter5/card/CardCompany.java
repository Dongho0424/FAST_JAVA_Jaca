package chapter5.card;

public class CardCompany {

    private CardCompany(){}

    private static CardCompany cardCompany = new CardCompany();

    public static CardCompany getInstance(){
        return cardCompany;
    }

    public Card createCard(){
        Card newCard = new Card();
        return newCard;
    }


}
