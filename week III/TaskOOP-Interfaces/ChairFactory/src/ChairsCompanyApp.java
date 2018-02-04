public class ChairsCompanyApp {

    public static void main(String[] args) {
        Magazine magazine = new Magazine();
        Factory factory = new Factory();
        Logistics logistic = new Logistics(magazine, factory);
        logistic.deliverMaterialsToFactory();
        factory.showState();
        factory.produceChairs();
        factory.showState();
        logistic.sendChairsFromFactoryToMagazine();
        magazine.showState();
    }

}
