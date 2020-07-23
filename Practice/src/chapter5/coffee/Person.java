package chapter5.coffee;

public class Person {
    private String name;
    private int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void buyStarCoffee(StarCoffee star, int money) {
        String message = star.brewing(money);
        if (message != null) {
            this.money -= money;
            System.out.println(name + money + message);
        }
    }

    public void buyBeanCoffee(BeanCoffee bean, int money) {
        String message = bean.brewing(money);
        if (message != null) {
            this.money -= money;
            System.out.println(name + money + message);
        }
    }
}
