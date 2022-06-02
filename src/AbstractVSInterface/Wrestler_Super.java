package AbstractVSInterface;

public abstract class Wrestler_Super {

    public void paymentForWork(int hours){
        System.out.println("The Wrestler will make $" + hours*250.00 + " for tonight's match");

    }
    public abstract void themeMusic();

    public abstract void finisher();
}
