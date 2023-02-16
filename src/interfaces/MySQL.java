package interfaces;

public class MySQL implements IDataAccess {
    @Override
    public void insert() {
        System.out.println("MYSQL: INSERT INTO...");
    }

    @Override
    public void list() {
        System.out.println("MYSQL: SELECT * FROM...");
    }

    @Override
    public void update() {
        System.out.println("MYSQL: SET...");
    }

    @Override
    public void delete() {
        System.out.println("MYSQL: DELETE * FROM...");
    }
}
