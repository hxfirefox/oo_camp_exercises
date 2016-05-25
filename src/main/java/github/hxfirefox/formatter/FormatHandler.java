package github.hxfirefox.formatter;

import github.hxfirefox.lengthunit.Length;
import github.hxfirefox.lengthunit.LengthUnit;

public class FormatHandler {
    private int restLen;

    public FormatHandler(Length length) {
        this.restLen = length.getLength() * length.getUnit().getAmountOfBaseUnit();
    }

    public String format() {
        String out = "";
        for (LengthUnit unit : LengthUnit.values()) {
            out += format(unit);
        }

        return out;
    }

    public String format(LengthUnit unit) {
        if (restLen % unit.getAmountOfBaseUnit() >= 0 && restLen / unit.getAmountOfBaseUnit() == 0) {
            return "";
        }
        String split = restLen % unit.getAmountOfBaseUnit() != 0 ? " " : "";
        String out = restLen / unit.getAmountOfBaseUnit() + " " + unit.toString() + split;
        restLen = restLen % unit.getAmountOfBaseUnit();
        return out;
    }
}
