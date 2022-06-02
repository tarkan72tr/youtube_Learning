package AABInterface;

public class StoneCold implements Wrestler_Super {


    @Override
    public void themeMusic() {
        System.out.println("StoneCold's Intro Music");
    }

    @Override
    public void finisher() {
        System.out.println("Stone Cold Stunner");

    }

    @Override
    public void paymentForWork(int hours) {
        System.out.println("Kane will make $"+ hours*300 + " for his match");
    }
}
