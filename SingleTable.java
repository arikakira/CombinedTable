public class SingleTable {
    private int seats;
    private double viewQuality;
    private int height;

    public SingleTable(int s, double vq, int h) {
        seats = s;
        viewQuality = vq;
        height = h;
    }
    /**
     * Returns the number of seats at this table. The value is always greater than
     * or equal to 4.
     */
    public int getNumSeats() {
        return seats;
    }


    /** Returns the height of this table in centimeters. */
    public int getHeight() {
        /* implementation not shown */ }


    /** Returns the quality of the view from this table. */
    public double getViewQuality() {
        /* implementation not shown */ }


    /** Sets the quality of the view from this table to value . */
    public void setViewQuality(double value) {
        /* implementation not shown */ }
    // There may be instance variables, constructors, and methods that are not
    // shown.
}