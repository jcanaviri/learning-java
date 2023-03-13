package exercises;

public class TowerOfHanoi {
    public static void move(int disc, String from, String to, String aux) {
        if (disc > 0) {
            move(disc - 1, from, aux, to);
            System.out.println("Disc " + disc + " → move from " + from + " to " + to);
            move(disc - 1, aux, to, from);
        }
    }

    public static void main(String[] args) {
        move(3, "A", "C", "B");
    }

}
