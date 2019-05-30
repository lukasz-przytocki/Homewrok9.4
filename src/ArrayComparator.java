public class ArrayComparator {

    boolean compare(int[] table1, int[] table2){
        boolean state=false;
        if(table1==null || table1.length==0 || table2==null || table2.length==0 || table1.length!=table2.length){
            state = false;

        }else{
            for (int i = 0; i <table1.length ; i++) {
                if(table1[i] == table2[i]){
                    state = true;
                }else {
                    state = false;
                }
            }
        }
        return state;
    }
}
