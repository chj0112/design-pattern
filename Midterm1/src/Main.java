// 수정하지 말 것
public class Main {
    public static void main(String[] args) {
        NumberData nd = new NumberDataSortingFactory();
        String[] algs = { "Bubble", "Insertion", "Selection" };
        for (int i = 0; i < algs.length; i++) {
            System.out.printf("Using %s algorithm\n", algs[i]);
            nd.stirSortPrintData(algs[i]);
        }
    }
}

//스트래티지 패턴 구현
//SortAlg 인터페이스를 구현하는 BubbleSort, InsertionSort, SelectionSort 클래스를 만들어 중복을 공통화시키고 그때그때 맞는 알고리즘을 호출시키도록 하였다.
//
//팩토리 메소드 패턴 구현
//NumberData 클래스에서 sortAlg 객체 생성하는 부분을 NumberDataSortingFactory 클래스로 분리하여 캡슐화시킴으로써 객체가 생성되는 방법이 변경되어도 연쇄적인 수정이 적어진다.