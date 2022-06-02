public class Cat extends Animal implements AnimalStuff{

    @Override
    public void makeNoise() {
        System.out.println("Meowww");
    }

    @Override
    public void poop() {
        System.out.println("POOOOOPPPPPP");
    }
}
