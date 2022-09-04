package OOPS.Inheritance;

public class HybridInheritance {
    void show() {
        System.out.println("I am Grand Father");
    }
} 
class Father extends HybridInheritance {
    void show() {
        System.out.println("I am Father");
    }
}
class Son extends Father {
   
     
    void show(){
        System.out.println("I am son");
    }
}
class Daughter extends Father {
    void show(){
        System.out.println("I am Daughter");
    }
}
class Main {
    public static void main(String[] args) {
        Daughter c = new Daughter();
        c.show();
    }
}


