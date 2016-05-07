public class Feet {
    private int length;

    public Feet(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Feet feet = (Feet) o;

        return length == feet.length;

    }

    @Override
    public int hashCode() {
        return length;
    }

    public Feet add(Feet other) {
        return new Feet(this.length + other.length);
    }
}
