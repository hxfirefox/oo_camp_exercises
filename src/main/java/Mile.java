public class Mile extends Length {

    private Mile(int length) {
        super(length, MILE_TO_BASE_UNIT);
    }

    public static Mile createMile(int length) {
        return new Mile(length);
    }
}
