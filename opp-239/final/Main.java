class Animal {

public void animalSound() { System.out.println("The animal makes a sound");

}
public void eat(){
	System.out.println("Cat eat met");



}

}

class Cow extends Animal {
@Override

public void animalSound() { System.out.println("The cow says: moo moo");

}
public void eat(){
	System.out.println("Cat eat mt");



}


}

class Cat extends Animal {
@Override

public void animalSound() { System.out.println("The cat says: meow meow");

}
@Override
public void eat(){
	System.out.println("Cat eat meet");



}

}

class Main {

public static void main(String[] args) {

Animal myAnimal = new Animal(); // Create a Animal object
// System.out.println(myAnimal); 
Animal myCow = new Cow(); // Create a Cow object

Animal myCat = new Cat(); // Create a Cat object
myAnimal.animalSound();

myCow.animalSound();
myCat.animalSound();
myCat.eat();

Animal arr[] = new Animal[1];
arr[0] = new Animal();
arr[0].animalSound();

}


}