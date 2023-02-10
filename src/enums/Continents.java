package enums;

public enum Continents {
    AMERICA(34),
    AFRICA(53),
    EUROPE(46),
    ASIA(44),
    OCEAN(14);

    private final int countries;

    Continents(int countries) {
        this.countries = countries;
    }

    public int getCountries() {
        return this.countries;
    }
}
