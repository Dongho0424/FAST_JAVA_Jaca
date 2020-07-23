package chapter5.coffee;

public class BeanCoffee {
    private int money;

    public String brewing(int money) {
        this.money += money;
        if(money == Menu.BEANAMERICANO){
            return "You purchase beanAmericano!";
        }
        else if (money == Menu.BEANLATTE){
            return "You purchase beanLatte!";
        }
        else{
            return null;
        }
    }
}
