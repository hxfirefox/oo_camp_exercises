package github.hxfirefox.quantity;

public class VolUnit implements Unit{
    public static final int TBSP_TO_BASE_UNIT = 3;
    private static final int TSP_TO_BASE_UNIT = 1;
    private static final int OZ_TO_BASE_UNIT = 2 * 3;
    private static final int BASE_UNIT = 1;
    private int amountOfBaseUnit;

    public VolUnit(int amountOfBaseUnit) {
        this.amountOfBaseUnit = amountOfBaseUnit;
    }

    @Override
    public int getAmountOfBaseUnit() {
        return amountOfBaseUnit;
    }

    @Override
    public Unit createBaseUnit() {
        return new VolUnit(BASE_UNIT);
    }

    public static Unit createTbsp() {
        return new VolUnit(TBSP_TO_BASE_UNIT);
    }

    public static Unit createTsp() {
        return new VolUnit(TSP_TO_BASE_UNIT);
    }

    public static Unit createOz() {
        return new VolUnit(OZ_TO_BASE_UNIT);
    }
}
