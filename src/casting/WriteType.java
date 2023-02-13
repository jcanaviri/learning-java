package casting;

public enum WriteType {
    CLASSIC("Handwriting"),
    MODERN("Digital writing")
    ;

    private final String description;

    WriteType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
