package github.hxfirefox.formatter;

import github.hxfirefox.lengthunit.Length;
import github.hxfirefox.lengthunit.LengthUnit;

public class FormatHandler {
    private int restLen;
    private static FormatHandler handler = null;

    private FormatHandler() {
    }

    public static FormatHandler getInstance() {
        if (handler == null) {
            return new FormatHandler();
        }
        return handler;
    }

    public FormatHandler withParams(Length length) {
        this.restLen = length.getLength() * length.getUnit().getAmountOfBaseUnit();
        return this;
    }

    public String format() {
        if (restLen == 0) {
            return "0 INCH";
        }
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
