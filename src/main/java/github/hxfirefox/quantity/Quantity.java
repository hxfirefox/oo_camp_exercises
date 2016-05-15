package github.hxfirefox.quantity;

public class Quantity<T extends Unit> {
    private int value;
    private Unit unit;

    public Quantity(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        Quantity<T> quantity = (Quantity<T>) o;

        return this.value * unit.getAmountOfBaseUnit() == quantity.value * quantity.unit.getAmountOfBaseUnit();
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        return result;
    }

    public Quantity<T> add(Quantity<T> other) {
        return new Quantity<T>(this.value * unit.getAmountOfBaseUnit() +
                other.value * other.unit.getAmountOfBaseUnit(), this.unit.createBaseUnit());
    }
}
