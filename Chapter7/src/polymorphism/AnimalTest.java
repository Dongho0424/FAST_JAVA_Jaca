package polymorphism;

import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("the animal moves");
    }

    public void eating(){
        System.out.println("the animal eats");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("the human moves");
    }

    public void read() {
        System.out.println("the human reads a book");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("the tiger moves");
    }

    public void hunting() {
        System.out.println("the tiger hunts");
    }

}

class Eagle extends Animal {
    public void move() {
        System.out.println("the eagle moves");
    }

    public void flying() {
        System.out.println("the eagle flies");
    }
}

public class AnimalTest {
    public static void main(String[] args) {

        // polymorphism 1
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

//        AnimalTest test = new AnimalTest();
//        test.moveAnimal(hAnimal);
//        test.moveAnimal(tAnimal);
//        test.moveAnimal(eAnimal);

        // polymorphism 2
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

//        for (Animal animal : animalList) {
//            animal.move();
//        }

        // not polymorphism
//        hAnimal.move();

        // downcasting
//        Eagle human = (Eagle)hAnimal;
        if (hAnimal instanceof Human) {
            Human human = (Human) hAnimal;
            human.read();
        }

        AnimalTest test = new AnimalTest();
        test.testDownCasting(animalList);

    }

    public void testDownCasting(ArrayList<Animal> list){
        // to downcast more safely using "instanceof"
        for(int i=0; i<list.size(); i++){
            Animal animal = list.get(i);

            if(animal instanceof Human){
                Human human = (Human)animal;
                human.read();
            }
            else if(animal instanceof Tiger){
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            }
            else if(animal instanceof Eagle){
                Eagle eagle = (Eagle)animal;
                eagle.flying();
            }
        }
    }


    public void moveAnimal(Animal animal) {
        animal.move();
    }

}
