package org.academiadecodigo.hackstreetboys.persistence.model;

public enum Status {
    FULL("The beach is full, go back home!"),
    HALF_FULL("If you arrive quickly you can come."),
    EMPTY("It is totally empty. The beach is yours to enjoy.");

    private final String warning;

    Status(String warning) {
        this.warning = warning;
    }

    public String getWarning() {
        return warning;
    }

    @Override
    public String toString() {
        return warning;
    }
}
