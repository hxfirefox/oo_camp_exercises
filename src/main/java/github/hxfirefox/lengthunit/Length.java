package github.hxfirefox.lengthunit;

import static github.hxfirefox.lengthunit.LengthUnit.*;

public class Length {


    protected int length;
    protected LengthUnit unit;

    private Length(int length, LengthUnit unit) {
        this.length = length;
        this.unit = unit;
    }

    public static Length mile(int length) {
        return new Length(length, Mile);
    }

    public static Length yard(int length) {
        return new Length(length, Yard);
    }

    public static Length feet(int length) {
        return new Length(length, Feet);
    }

    public static Length inch(int length) {
        return new Length(length, Inch);
    }

    @Override
    public boolean equals(Object o) {
        Length length = (Length) o;

        return this.length * unit.getAmountOfBaseUnit() ==
                length.length * length.unit.getAmountOfBaseUnit();
    }

    @Override
    public int hashCode() {
        return length;
    }

    public Length add(Length other) {
        final int len = this.length * unit.getAmountOfBaseUnit() +
                other.length * other.unit.getAmountOfBaseUnit();
        return new Length(len, BaseUnit);
    }

    @Override
    public String toString() {
        if (length == 0) {
            return "0 INCH";
        }
        return null;
    }
}
