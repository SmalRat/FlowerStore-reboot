package ua.edu.ucu.apps.web.flower;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("#FF0000"), BLUE("#0000FF"), ORANGE("#FF9300"), GREEN("2EFF00");
    private final String stringRepresentation;

    FlowerColor(final String stringRepr) {
        this.stringRepresentation = stringRepr;
    }

    @Override
    public final String toString() {
        return stringRepresentation;
    }
}
