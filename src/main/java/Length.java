public class Length {
    protected int length;

    public Length(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        Length length = (Length) o;

        return this.length == length.length;

    }

    @Override
    public int hashCode() {
        return length;
    }

    public Length add(Length other) {
        return new Length(this.length + other.length);
    }
}
