public class Tags {
    public static void main(String[] args) {
        start:
        for (var i = 0; i < 5; i++) {
            if (i % 2 != 0) continue start;
            System.out.println("i = " + i);
        }
    }
}
