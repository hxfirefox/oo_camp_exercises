public class Mile extends Length {

    public static final int MILE_TO_BASE_UNIT = 1760 * 12 * 3;

    private Mile(int length) {
        super(length, MILE_TO_BASE_UNIT);
    }

    public static Mile createMile(int length) {
        return new Mile(length);
    }
}
