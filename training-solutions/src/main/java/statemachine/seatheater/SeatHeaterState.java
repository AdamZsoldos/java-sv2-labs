package statemachine.seatheater;

public enum SeatHeaterState {

    OFF {
        @Override
        public SeatHeaterState next() { return LEVEL_THREE; }
    },

    LEVEL_ONE {
        @Override
        public SeatHeaterState next() { return OFF; }
    },

    LEVEL_TWO {
        @Override
        public SeatHeaterState next() { return LEVEL_ONE; }
    },

    LEVEL_THREE {
        @Override
        public SeatHeaterState next() { return LEVEL_TWO; }
    };

    public abstract SeatHeaterState next();
}
