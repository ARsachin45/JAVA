package OOPS;

public class MultilvelInheritance {
    void eat(){
        System.out.println("EATING");
    }
}
class Dog extends MultilvelInheritance {
    void bark(){
        System.out.println("BARKING");
    }
}
class BabyDog extends Dog {
    void weep(){
        System.out.println("Weeping");
    }
        
    }
 class main {
        public static void main(String[]args) {
            BabyDog g = new BabyDog();
            g.bark();
            g.eat();
            g.weep();
        }
    }

