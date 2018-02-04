public class Logistics {
    private ChairsReceiver receiveChairs;
    private MaterialsReceiver receiveMaterials;

    public Logistics(ChairsReceiver receiveChairs, MaterialsReceiver receiveMaterials) {
        this.receiveChairs = receiveChairs;
        this.receiveMaterials = receiveMaterials;
    }

    public void deliverMaterialsToFactory() {
        receiveMaterials.receiveMaterials(1500);
    }

    public void sendChairsFromFactoryToMagazine() {
        int chairsToTransport = receiveMaterials.directChairs();
        receiveChairs.receiveChairs(chairsToTransport);
    }
}
