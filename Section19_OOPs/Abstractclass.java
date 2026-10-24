package Section19_OOPs;
abstract class Animal {
    public abstract void sound();

    public void eat() {
        System.out.println("animal jim rhe h");
    }
}

class Dog extends Animal {


    public void sound() {
        System.out.println("dog barks");
    }
}
public class Abstractclass {
    public static void main(String[] args){

    Dog d = new Dog();
    d.sound();
    d.eat();
    }
    
}
