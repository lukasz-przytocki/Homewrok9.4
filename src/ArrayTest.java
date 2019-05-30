public class ArrayTest {
    public static void main(String[] args) {
        ArrayComparator arrayComparator = new ArrayComparator();
        int[] table0={1,2,3,4};
        int[] table1={1,2,3};
        int[] table2={1,2,3};
        int[] table3={1,9,3};

        int[][] table44 = {{1,2},{3,4}};
        int[][] table55 = {{1,2},{3,4}};
        int[][] table66 = {{1,2},{2,4}};

        System.out.println("Tables are even?: " + arrayComparator.compare(table0, table1));
        System.out.println("Tables are even?: " + arrayComparator.compare(table1, table2));
        System.out.println("Tables are even?: " + arrayComparator.compare(table2, table3));

        System.out.println("Tables are even?: " + arrayComparator.compare(table44, table55));
        System.out.println("Tables are even?: " + arrayComparator.compare(table55, table66));



    }
}
