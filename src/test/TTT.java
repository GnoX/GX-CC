package test;

public class TTT implements Test.Listener {


    private static TTT instance;

    public static TTT getInstance() {
        if (instance == null)
            instance = new TTT();
        return instance;
    }

    private TTT() {
        // required private constructor
    }

    public static int getRandomNumber() {
        return 2; // so random
    }

    @Override
    public void trigger(int eventNumber) {
        System.out.println("EVENT TRIGERRED " + eventNumber);
    }
}
