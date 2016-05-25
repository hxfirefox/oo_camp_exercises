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
        String out = "";
        if (restLen == 0) {
            return "";
        }
        if (restLen % unit.getAmountOfBaseUnit() == 0) {
            out = restLen / unit.getAmountOfBaseUnit() + " " + unit.toString();
            restLen = 0;
            return out;
        } else {
            if (restLen / unit.getAmountOfBaseUnit() == 0) {
                return "";
            } else {
                out = restLen / unit.getAmountOfBaseUnit() + " " + unit.toString() + " ";
                restLen = restLen % unit.getAmountOfBaseUnit();
                return out;
            }
        }
    }
}
