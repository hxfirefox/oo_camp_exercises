public class Yard {
    private int length;

    public Yard(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Yard yard = (Yard) o;

        return length == yard.length;

    }

    @Override
    public int hashCode() {
        return length;
    }

    public Yard add(Yard other) {
        return new Yard(this.length + other.length);
    }
}
