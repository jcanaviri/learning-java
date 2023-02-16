package interfaces;

public class Main {
    public static void main(String[] args) {
        MySQL db1 = new MySQL();

        db1.insert();
        db1.list();
        db1.update();
        db1.delete();

        Postgres db2 = new Postgres();
        db2.insert();
        db2.list();
        db2.update();
        db2.delete();
    }
}
