public class Inch extends Length {

    public static final int INCH_TO_BASE_UNIT = 1;

    public Inch(int length) {
        super(length);
        setAmountOfBaseUnit(INCH_TO_BASE_UNIT);
    }

}
