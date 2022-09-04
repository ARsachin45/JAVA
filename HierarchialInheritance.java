package OOPS.Inheritance;

public class HierarchialInheritance {
    void eat(){
        System.out.println("Eating");
    }
}
class Dog extends HierarchialInheritance {
    void bark(){
        System.out.println("Barking");
    }
}
class cat extends HierarchialInheritance {
    void meaw(){
        System.out.println("Meawing");
    }
}
class main {
    public static void main(String[] ar) {
        cat s = new cat();
        Dog d = new Dog();
        s.eat();
        d.bark();
        s.meaw();
        
    }
}