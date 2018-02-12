package chairfactory;

public class Factory implements MaterialsReceiver {

    private static final int UNIT_PER_ONE_CHAIR = 10;
    private int rawMaterialUnits;// zapas, aktualny stan surowca do produkcji
    private int chairsCount;//licznik krzeseł

    public Factory() {
        this.rawMaterialUnits = 0;
        this.chairsCount = 0;
    }

    @Override
    public void receiveMaterials(int materialsUnit) {
        rawMaterialUnits += materialsUnit;
    }

    public void produceChairs() {
        int producedChairs = rawMaterialUnits / UNIT_PER_ONE_CHAIR;
        chairsCount += producedChairs;
        rawMaterialUnits -= chairsCount * UNIT_PER_ONE_CHAIR;
    }

    @Override
    public int directChairs() {
        int chairsDelivery = chairsCount;
        chairsCount -= chairsDelivery;
        return chairsDelivery;
    }

    public void showState() {
        System.out.println("Produced chairs to magazine (delivery): " + chairsCount);
        System.out.println("Actual stock of raw material for production: " + rawMaterialUnits);
    }
}
