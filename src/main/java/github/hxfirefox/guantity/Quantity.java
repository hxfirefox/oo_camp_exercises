package github.hxfirefox.guantity;

public class Quantity<T extends Unit> {
    private int value;
    private Unit unit;

    public Quantity(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }
}
