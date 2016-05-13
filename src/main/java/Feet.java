public class Feet extends Length {

    public static final int FEET_TO_BASE_UNIT = 3;

    public Feet(int length) {
        super(length);
        setAmountOfBaseUnit(FEET_TO_BASE_UNIT);
    }

}
