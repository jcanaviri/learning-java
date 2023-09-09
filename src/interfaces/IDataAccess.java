package interfaces;

/*
    In Java, an interface is a blueprint for a class that defines a set of abstract methods (methods without implementations) that must be implemented by any class that implements the interface. It provides a way to achieve abstraction and define a contract that classes must adhere to. Here are some key points about interfaces in Java:
*/
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
