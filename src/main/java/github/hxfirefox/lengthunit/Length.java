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
        boolean finish = false;
        String out = "";
        if (length == 0) {
            return "0 INCH";
        }
        int baseLen = length * unit.getAmountOfBaseUnit();
        if (baseLen % Mile.getAmountOfBaseUnit() == 0) {
            out += baseLen / Mile.getAmountOfBaseUnit() + " " + Mile.toString();
            finish = true;
            return out;
        } else {
            if (baseLen / Mile.getAmountOfBaseUnit() == 0) {
                out += "";
            } else {
                out += baseLen / Mile.getAmountOfBaseUnit() + " " + Mile.toString() + " ";
                baseLen = baseLen % Mile.getAmountOfBaseUnit();
            }
        }
        if (baseLen % Yard.getAmountOfBaseUnit() == 0) {
            out += baseLen / Yard.getAmountOfBaseUnit() + " " + Yard.toString();
            finish = true;
            return out;
        } else {
            if (baseLen / Yard.getAmountOfBaseUnit() == 0) {
                out += "";
            } else {
                out += baseLen / Yard.getAmountOfBaseUnit() + " " + Yard.toString() + " ";
                baseLen = baseLen % Yard.getAmountOfBaseUnit();
            }
        }
        if (baseLen % Feet.getAmountOfBaseUnit() == 0) {
            out += baseLen / Feet.getAmountOfBaseUnit() + " " + Feet.toString();
            finish = true;
            return out;
        } else {
            if (baseLen / Feet.getAmountOfBaseUnit() == 0) {
                out += "" + baseLen % Feet.getAmountOfBaseUnit() + " " + Inch.toString();
            } else {
                out += baseLen / Feet.getAmountOfBaseUnit() + " " + Feet.toString() + " ";
                baseLen = baseLen % Feet.getAmountOfBaseUnit();
                out += baseLen + " " + Inch.toString();
            }
        }

        return out;
    }
}
