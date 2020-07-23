
package chapter5.coffee;

public class StarCoffee {

    int money;

    public String brewing(int money) {

        this.money += money;
        if(money == Menu.STARAMERICANO) {
            return "You purchase starAmericano!";
        }
        else if(money == Menu.STARLATTE) {
            return "You purchase starLatte!";
        }
        else {
            return null;
        }
    }
}