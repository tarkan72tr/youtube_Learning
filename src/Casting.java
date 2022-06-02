public class Casting {

    public static void main(String[] args) {

        Animal myAnimal = new Dog();         // upcasting automatic...
//      myAnimal.growl();        not works because the animal class dosent have gowl method.

        Dog myDog = new Dog();
        myDog.growl();


        doAnimalStuff(myAnimal); // Because pass actual object is dog it print out Woof woof....
    }


    //why we need upcasting

    public static void doAnimalStuff(Animal animal){

        animal.makeNoise();
//      myAnimal.growl();        not works because the animal class dosent have gowl method.

        Dog mydog = (Dog) animal;
        mydog.growl();
    }
}
