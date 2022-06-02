package AABInterface;

public class Kane implements Wrestler_Super {
    @Override
    public void themeMusic() {
        System.out.println("Kane's Intro Music");
    }

    @Override
    public void finisher() {
        System.out.println("Tombstone");

    }

    @Override
    public void paymentForWork(int hours) {
        System.out.println("Kane will make $"+ hours*200 + " for his match");

    }
}
