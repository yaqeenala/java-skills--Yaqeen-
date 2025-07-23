public class VisitorCounter {
    private static int totalVisitors = 0;
    private int sessionVisitors;
    private String visitorName;

    public VisitorCounter(String name) {
        this.visitorName = name;
        this.sessionVisitors = 0;
        totalVisitors ++;
    }

    public void recordVisit() {
        sessionVisitors ++;
        System.out.println(visitorName + "visited. Session visits: " + sessionVisitors);
    }

    public static void displayTotalVisitors() {
        System.out.println("Total visitors today: " + totalVisitors);
    }

    public static int getTotalVisitors() {
        return totalVisitors;
    }

    public static void main(String[] args) {
        VisitorCounter visitor1 = new VisitorCounter("Asma");
        VisitorCounter visitor2 = new VisitorCounter("Issa");
        VisitorCounter visitor3 = new VisitorCounter("Noura");
        visitor1.recordVisit();
        visitor1.recordVisit();
        visitor2.recordVisit();
        visitor3.recordVisit();
        visitor3.recordVisit();
        visitor1.recordVisit();
        VisitorCounter.displayTotalVisitors();

    }

}
