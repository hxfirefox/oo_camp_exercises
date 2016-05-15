package github.hxfirefox.quantity;

public class LenUnit implements Unit {
    public static final int MILE_TO_BASE_UNIT = 1760 * 12 * 3;
    private static final int YARD_TO_BASE_UNIT = 12 * 3;
    private static final int BASE_UNIT = 1;
    private int amountOfBaseUnit;

    public LenUnit(int amountOfBaseUnit) {
        this.amountOfBaseUnit = amountOfBaseUnit;
    }

    @Override
    public int getAmountOfBaseUnit() {
        return amountOfBaseUnit;
    }

    @Override
    public Unit createBaseUnit() {
        return new LenUnit(BASE_UNIT);
    }

    public static Unit createMile() {
        return new LenUnit(MILE_TO_BASE_UNIT);
    }

    public static Unit createYard() {
        return new LenUnit(YARD_TO_BASE_UNIT);
    }
}
