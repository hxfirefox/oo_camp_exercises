package github.hxfirefox.lengthunit;

import github.hxfirefox.formatter.Printable;

import static github.hxfirefox.lengthunit.LengthUnit.*;

public class Length {
    protected int length;
    protected LengthUnit unit;

    private Length(int length, LengthUnit unit) {
        this.length = length;
        this.unit = unit;
    }

    public int getLength() {
        return length;
    }

    public LengthUnit getUnit() {
        return unit;
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

        return getBaseValue() ==
                length.getBaseValue();
    }

    @Override
    public int hashCode() {
        return length;
    }

    public Length add(Length other) {
        final int len = getBaseValue() +
                other.getBaseValue();
        return new Length(len, Inch);
    }

    public String format(Printable printable) {
        return printable.print(this);
    }

    private int getBaseValue() {
        return length * unit.getAmountOfBaseUnit();
    }
}
