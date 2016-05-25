package github.hxfirefox.lengthunit;

public enum LengthUnit {
    Mile {
        private static final int MILE_TO_BASE_UNIT = 1760 * 12 * 3;

        public int getAmountOfBaseUnit() {
            return MILE_TO_BASE_UNIT;
        }

        @Override
        public String toString() {
            return "MILE";
        }
    },
    Yard {
        private static final int YARD_TO_BASE_UNIT = 12 * 3;

        public int getAmountOfBaseUnit() {
            return YARD_TO_BASE_UNIT;
        }

        @Override
        public String toString() {
            return "YARD";
        }

    },
    Feet {
        private static final int FEET_TO_BASE_UNIT = 12;

        public int getAmountOfBaseUnit() {
            return FEET_TO_BASE_UNIT;
        }

        @Override
        public String toString() {
            return "FEET";
        }
    },
    Inch {
        private static final int INCH_TO_BASE_UNIT = 1;

        public int getAmountOfBaseUnit() {
            return INCH_TO_BASE_UNIT;
        }

        @Override
        public String toString() {
            return "INCH";
        }
    };

    LengthUnit() {
    }

    public int getAmountOfBaseUnit() {
        return 1;
    }
}
