public class Mile {
    private int length;

    public Mile(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mile mile = (Mile) o;

        return length == mile.length;

    }

    @Override
    public int hashCode() {
        return length;
    }
}
