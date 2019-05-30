public class ArrayTest {
    public static void main(String[] args) {
        ArrayComparator arrayComparator = new ArrayComparator();
        int[] table1={1,2,3,4};
        int[] table2={1,2,3};
        int[] table3={1,2,3};

        System.out.println("Tables are even?: " + arrayComparator.compare(table1, table2));
        System.out.println("Tables are even?: " + arrayComparator.compare(table2, table3));


    }
}
