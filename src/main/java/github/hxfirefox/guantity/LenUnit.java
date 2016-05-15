package github.hxfirefox.guantity;

public class LenUnit implements Unit {
    public static final int MILE_TO_BASE_UNIT = 1760 * 12 * 3;
    private int amountOfBaseUnit;

    public LenUnit(int amountOfBaseUnit) {
        this.amountOfBaseUnit = amountOfBaseUnit;
    }

    @Override
    public int getAmountOfBaseUnit() {
        return amountOfBaseUnit;
    }

    public static Unit createMile() {
        return new LenUnit(MILE_TO_BASE_UNIT);
    }
}
