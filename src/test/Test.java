package test;


/**
 * Lol, I were just explaining something to friend who knows nothing about this
 */
public class Test {
    public static int FLAGS = 0;
    public static final int FLAG_1 = 0b1;
    public static final int FLAG_2 = 0b10;
    public static final int FLAG_3 = 0b100;
    public static final int FLAG_4 = 0b1000;
    public static final int FLAG_5 = 0b10000;
    public static final int FLAG_6 = 0b100000;
    public static final int FLAG_7 = 0b1000000;

    public static Listener listener;

    public static void addFlag(int flag) {
        FLAGS |= flag;
    }

    public static void removeFlag(int flag) {
        FLAGS &= ~flag;
    }

    public static boolean getFlag(int flag) {
        return (FLAGS & flag) > 0;
    }

    public static void trig(Listener listener) {
        listener.trigger(15);
    }

    public static void main(String[] args) {
        listener = TTT.getInstance();

        listener.trigger(2);

        int x = 0;

        int a = 127;
        int b = 2;
        int c = 3;
        int d = 127;

        x = x | (a << 24);
        x = x | (b << 16);
        x = x | (c << 8);
        x = x | d;

        System.out.println("a: " + (x >> 24));
        System.out.println("b: " + (x << 8 >> 24));
        System.out.println("c: " + (x << 16 >> 24));
        System.out.println("d: " + (x << 24 >> 24));

        addFlag(FLAG_1);
        addFlag(FLAG_4);
        addFlag(FLAG_6);
        removeFlag(FLAG_1);

        System.out.println("FLAG 1: " + getFlag(FLAG_1));
        System.out.println("FLAG 2: " + getFlag(FLAG_2));
        System.out.println("FLAG 3: " + getFlag(FLAG_3));
        System.out.println("FLAG 4: " + getFlag(FLAG_4));
        System.out.println("FLAG 5: " + getFlag(FLAG_5));
        System.out.println("FLAG 6: " + getFlag(FLAG_6));
        System.out.println("FLAG 7: " + getFlag(FLAG_7));

    }

    public interface Listener {
        public void trigger(int eventNumber);
    }
}
