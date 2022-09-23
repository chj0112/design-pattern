public class Sorter {
    Comparable compare;
    public Sorter(Comparable compare) {
        this.compare = compare;
    }
    public void setComparable(Comparable compare) {
        this.compare = compare;
    }
    public void bubbleSort(Object[] objs) {
        for (int i = 0; i < objs.length - 1; i++) {
            for (int j = 0; j < objs.length - i - 1; j++) {
                if (compare.compareTo(objs[j], objs[j + 1]) > 0) { // swap
                    Object temp = objs[j];
                    objs[j] = objs[j + 1];
                    objs[j + 1] = temp;
                }
            }
        }
    }
}
