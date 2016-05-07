public class Inch {
    private int length;

    public Inch(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Inch inch = (Inch) o;

        return length == inch.length;

    }

    @Override
    public int hashCode() {
        return length;
    }

    public Inch add(Inch other) {
        return new Inch(this.length + other.length);
    }
}
