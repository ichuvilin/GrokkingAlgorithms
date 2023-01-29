public class Countdown {

    private static void countdown(int i) {
        if (i <= 0) return;
        countdown(i - 1);
    }

    public static void main(String[] args) {
        countdown(5);
    }
}
