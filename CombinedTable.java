public class CombinedTable {
    private SingleTable one;
    private SingleTable two;

    public CombinedTable(SingleTable o, SingleTable t) {
        one = o;
        two = t;
    }

    public boolean canSeat(int ppl) {
        return (ppl <= (one.getNumSeats()+two.getNumSeats()-2));
    }

    public double getDesirability() {
        double average = (one.getViewQuality()+two.getViewQuality()) / 2;
        if(one.getHeight() == two.getHeight()) {
            return average;
        } else {
            return average-10;
        }
    }
}