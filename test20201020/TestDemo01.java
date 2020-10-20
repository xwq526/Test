package test20201020;

public class TestDemo01 {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addLast(2);
        mySingleList.addLast(23);
        mySingleList.addLast(2);
        mySingleList.addLast(2);
//        mySingleList.addFirst(99);
//        mySingleList.addIndex(5,88);
        mySingleList.display();
        mySingleList.removeAllKey(2);
        mySingleList.display();
    }
}
