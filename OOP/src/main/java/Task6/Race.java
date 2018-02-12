package Task6;

public class Race {
    private Car winner;
    private Car[] competitors = new Car[3];
    private int countCompetitors = 0;

    public int getCountCompetitors() {
        return countCompetitors;
    }
    /*public Race() {
        competitors = new Car[3];
    }*/

    public Car getWinner() {
        return winner;
    }

    public void addCompetitor(Car car) {

        competitors[getCountCompetitors()] = car;
        countCompetitors++;
    }

    public void printCompetitors() {
        for (Car cars : competitors) {
            System.out.println(cars.getAutoDescription() + " ");
        }
    }

    public void printWinner() {
        double acceleration = 100000;
        for (int i = 0; i < competitors.length; i++) {
            if (competitors[i].getAccelerationTime() < acceleration) {
                acceleration = competitors[i].getAccelerationTime();
                winner = competitors[i];
            }
        }
        System.out.println("The winner is: " + getWinner().getAutoDescription());
    }

}

