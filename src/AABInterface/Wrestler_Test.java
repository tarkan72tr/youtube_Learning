package AABInterface;

public class Wrestler_Test {

    public static void main(String[] args) {
        Wrestler_Super wrestlerSuper1 = new Kane();
        Wrestler_Super wrestlerSuper2 = new StoneCold();

        wrestlerSuper1.themeMusic();
        wrestlerSuper1.finisher();
        wrestlerSuper1.paymentForWork(5);


        wrestlerSuper2.themeMusic();
        wrestlerSuper2.finisher();
        wrestlerSuper2.paymentForWork(3);
    }
}
