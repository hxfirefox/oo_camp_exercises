public class Length {
    public static final int YARD_TO_BASE_UNIT = 12 * 3;
    public static final int MILE_TO_BASE_UNIT = 1760 * YARD_TO_BASE_UNIT;
    public static final int BASE_UNIT = 1;
    protected int length;
    protected int unitFactor;

    public Length(int length, int unitFactor) {
        this.length = length;
        this.unitFactor = unitFactor;
    }

    public static Length createMile(int length) {
        return new Length(length, MILE_TO_BASE_UNIT);
    }

    public static Length createYard(int length) {
        return new Length(length, YARD_TO_BASE_UNIT);
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
        final Length newLength = new Length(len, BASE_UNIT);
        return newLength;
    }

    public void setUnitFactor(int unitFactor) {
        this.unitFactor = unitFactor;
    }
}
