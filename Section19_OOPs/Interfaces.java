package Section19_OOPs;
interface Animal {

    void sound();
    void eat();

    
}
  class Dog implements Animal{

     public void sound() {
        System.out.println("bhok rha h");
     }

     public void eat() {
        System.out.println("dog jimta h");
     }
  }

public class Interfaces {
    
    public static void main(String[] args){

        Dog d = new Dog();

        d.sound();
        d.eat();
    }
}
