public enum MoneyType {
    /**
     * GR - grosze
     * PLN - złotych
     * KILO - tysiące złotych
     */
    GR(0.01), PLN(1.0), KILO(1000);


    private double scaler;

    MoneyType(double scaler) {
        this.scaler = scaler;
    }

    public double getScaler() {
        return scaler;
    }

}
