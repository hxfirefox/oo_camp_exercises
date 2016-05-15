package github.hxfirefox.lengthunit;

public enum LengthUnit {
    BaseUnit {
        private static final int BASE_UNIT = 1;

        public int getAmountOfBaseUnit() {
            return BASE_UNIT;
        }
    },
    Inch {
        private static final int INCH_TO_BASE_UNIT = 1;

        public int getAmountOfBaseUnit() {
            return INCH_TO_BASE_UNIT;
        }
    },
    Feet {
        private static final int FEET_TO_BASE_UNIT = 3;

        public int getAmountOfBaseUnit() {
            return FEET_TO_BASE_UNIT;
        }
    },
    Yard {
        private static final int YARD_TO_BASE_UNIT = 12 * 3;

        public int getAmountOfBaseUnit() {
            return YARD_TO_BASE_UNIT;
        }
    },
    Mile {
        private static final int MILE_TO_BASE_UNIT = 1760 * 12 * 3;

        public int getAmountOfBaseUnit() {
            return MILE_TO_BASE_UNIT;
        }
    };

    LengthUnit() {
    }

    public int getAmountOfBaseUnit() {
        return 1;
    }
}
