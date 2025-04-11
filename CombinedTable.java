public class CombinedTable {
    private SingleTable one;
    private SingleTable two;

    public CombinedTable(SingleTable o, SingleTable t) {
        one = o;
        two = t;
    }

    public boolean canSeat(int ppl) {
        return (ppl < (one.getNumSeats()+two.getNumSeats()-2));
    }
}