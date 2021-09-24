package app;

public enum Option {
    EXIT(0,  "wyjście z programu"),
    ADD_BOOK(1, "dodanie nowej książki"),
    ADD_MAGAZINE(2, "dodanie nowego magazynu"),
    PRINT_BOOKS(3, "wyświetl dostępne książki"),
    PRINT_MAGAZINES(4, "wyświetl dostępne magazyny");

    private final int value;
    private final String desctription;

    Option(int value, String desctription) {
        this.value = value;
        this.desctription = desctription;
    }

    // Methods from object

    @Override
    public String toString() {
        return value + " - " + desctription;
    }

    // Methods

    static Option createFromInt(int option) {
        return Option.values()[option];
        }

    // Getters

    public int getValue() {
        return value;
    }

    public String getDesctription() {
        return desctription;
    }
}
