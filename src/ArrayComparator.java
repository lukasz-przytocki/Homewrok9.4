public class ArrayComparator {

    boolean compare(int[] table1, int[] table2){
        boolean isEqual=true;
        int i=0;

        if(table1==null || table1.length==0 || table2==null || table2.length==0 || table1.length!=table2.length){
            isEqual = false;

        }else{

            while (isEqual && i<table1.length){
                if(table1[i]!=table2[i]){
                    isEqual=false;
                }
                i++;
            }
        }
        return isEqual;
    }


    boolean compare(int[][] table1, int[][] table2) {
        boolean isEqual = true;
        int i = 0;


        if (table1 == null || table1.length == 0 || table2 == null || table2.length == 0 || table1.length != table2.length) {
            isEqual = false;

        } else {

            while (isEqual && i < table1.length) { //assumption square matrix
                int j = 0;
                while (isEqual && j < table1.length) {
                    if (table1[i][j] != table2[i][j]) {
                        isEqual = false;
                    }
                    j++;
                }
                i++;
            }

        }
        return isEqual;
    }
}


