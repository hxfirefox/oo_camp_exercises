public class Mile extends Length {

    public static final int MILE_TO_BASE_UNIT = 1760 * 12 * 3;

    public Mile(int length) {
        super(length);
        setAmountOfBaseUnit(MILE_TO_BASE_UNIT);
    }

}
