public class Inheritance {
    public static void main(String args[]){
        Fish Shark = new Fish();
        Shark.eat();
    }
}

class Animal{
    String colour;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breathes");
    }
}

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}