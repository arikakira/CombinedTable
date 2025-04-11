public class Main {
    public static void main(String[] args) {
        SingleTable t1 = new SingleTable(4, 60, 74);
        SingleTable t2 = new SingleTable(8, 70, 74);
        SingleTable t3 = new SingleTable(12, 75, 76);

        CombinedTable c1 = new CombinedTable(t1, t2);       // test case 1

        System.out.println(c1.canSeat(9));      // test case 2
        System.out.println(c1.canSeat(11));     // test case 3
        System.out.println(c1.getDesirability());       // test case 4

        CombinedTable c2 = new CombinedTable(t2, t3);       // test case 5
        System.out.println(c2.canSeat(18));     // test case 6
        System.out.println(c2.getDesirability());       // test case 7
        t2.setViewQuality(80);      // test case 8
        System.out.println(c2.getDesirability());       // test case 9
    }
}