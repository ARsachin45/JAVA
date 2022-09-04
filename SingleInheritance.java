package OOPS;

public class SingleInheritance {
    void eat(){
        System.out.println("Eating");
    }
}
    class dog extends SingleInheritance {
    void bark() {
        System.out.println("Barking");
    } 
}
    class Main {
        public static void main(String[] args) {
            dog d = new dog();
            d.eat();
            d.bark();
            
        }
    }
 

