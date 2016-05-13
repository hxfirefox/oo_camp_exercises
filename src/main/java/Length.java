public class Length {
    protected int length;
    private int amountOfBaseUnit;

    public Length(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        Length length = (Length) o;

        return this.length * amountOfBaseUnit == length.length * length.amountOfBaseUnit;

    }

    @Override
    public int hashCode() {
        return length;
    }

    public Length add(Length other) {
        final Length newLength =
                new Length(this.length * amountOfBaseUnit + other.length * other.amountOfBaseUnit);
        newLength.setAmountOfBaseUnit(1);
        return newLength;
    }

    public void setAmountOfBaseUnit(int amountOfBaseUnit) {
        this.amountOfBaseUnit = amountOfBaseUnit;
    }
}
