public class Yard extends Length {

    public static final int YARD_TO_BASE_UNIT = 12 * 3;

    public Yard(int length) {
        super(length);
        setAmountOfBaseUnit(YARD_TO_BASE_UNIT);
    }

}
