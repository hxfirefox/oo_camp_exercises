public class Length {
    protected int length;
    protected int unitFactor;

    public Length(int length, int unitFactor) {
        this.length = length;
        this.unitFactor = unitFactor;
    }

    @Override
    public boolean equals(Object o) {
        Length length = (Length) o;

        return this.length * unitFactor == length.length * length.unitFactor;

    }

    @Override
    public int hashCode() {
        return length;
    }

    public Length add(Length other) {
        final int len = this.length * unitFactor + other.length * other.unitFactor;
        final Length newLength =
                new Length(len, 1);
        return newLength;
    }

    public void setUnitFactor(int unitFactor) {
        this.unitFactor = unitFactor;
    }
}
