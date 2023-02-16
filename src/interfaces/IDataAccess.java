package interfaces;

@SuppressWarnings("unused")
public interface IDataAccess {
    // This is set as a constant
    int MAX_REGISTERS = 10;

    // Internally this is "void abstract"
    void insert();

    void list();

    void update();

    void delete();
}
