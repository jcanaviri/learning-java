package interfaces;

public class Postgres implements IDataAccess {
    @Override
    public void insert() {
        System.out.println("POSTGRES: INSERT INTO...");
    }

    @Override
    public void list() {
        System.out.println("POSTGRES: SELECT *...");
    }

    @Override
    public void update() {
        System.out.println("POSTGRES: SET...");
    }

    @Override
    public void delete() {
        System.out.println("POSTGRES: DELETE FROM...");
    }
}
