public class Test {
    static boolean VERBOSE = false;

    public static void main(String[] args) {
        long start=System.currentTimeMillis();

        // use AC3 & backtracking
        new AC3(Node.getNodes("data6"));

        // use forward checking & backtracking
        //new Backtracking(Node.getNodes("data6"));

        long end=System.currentTimeMillis();
        System.out.println("\r\ntotal running time:"+(end-start)+"ms");
    }
}
