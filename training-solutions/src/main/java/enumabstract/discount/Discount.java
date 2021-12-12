package enumabstract.discount;

public enum Discount {

    SPECIAL_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            return price * pieces * 0.8;
        }
    }, BLACK_FRIDAY_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            if (pieces <= 2) {
                return price * pieces * 0.75;
            } else {
                return (price * 0.5) + (price * (pieces - 1) * 0.75);
            }
        }
    };

    public abstract double getAmountToPay(int price, int pieces);
}
