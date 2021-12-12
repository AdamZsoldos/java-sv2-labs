package statemachine.typewriter;

public enum TypeWriterState {

    CAPS_LOCK_OFF {
        @Override
        public TypeWriterState next() { return CAPS_LOCK_ON; }
    },

    CAPS_LOCK_ON {
        @Override
        public TypeWriterState next() { return CAPS_LOCK_OFF; }
    };

    public abstract TypeWriterState next();
}
