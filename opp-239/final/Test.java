interface Pet{
    public static final int var1 = 1;
    void petMethod();
}
abstract class Animal
{
    public abstract void makesSound ();
    public void show(){
        System.out.println("aNIMAL sHOW");
    }
    public final void myMethod(){
        System.out.println("Final");
    }
    public static  void myStatic(){
        System.out.println("Static");
    }
}
class Cat extends Animal implements Pet{
    
    public void makesSound(){
    System.out.println("Meow Meow");   
    }
    public void petMethod(){
        System.out.println("Pet says: Meow Meow");
    }
}
public class Test{
    public static void main(String[] args){
   // Animal obj = new Animal();
   Cat obj = new Cat();
   obj.show();
   Animal.myStatic();
   Cat.myStatic();
   obj.myStatic();
   obj.myMethod();
   obj.petMethod();
   System.out.println(Cat.var1);
   
    }
}