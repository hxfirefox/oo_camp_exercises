package github.hxfirefox.lengthunit;

public enum LengthUnit {
    BaseUnit {
        private static final int BASE_UNIT = 1;

        public int getAmountOfBaseUnit() {
            return BASE_UNIT;
        }

        @Override
        public String toString() {
            return "INCH";
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
    Mile {
        private static final int MILE_TO_BASE_UNIT = 1760 * 12 * 3;

        public int getAmountOfBaseUnit() {
            return MILE_TO_BASE_UNIT;
        }

        @Override
        public String toString() {
            return "MILE";
        }
    };

    LengthUnit() {
    }

    public int getAmountOfBaseUnit() {
        return 1;
    }
}
