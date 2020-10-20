package test20201020;
class Node {
    public int data;
    public Node next;//存储对象引用

    public Node(int data) {
        this.data = data;
        //这里没有初始化next的引用是，不知道next当前指向哪个节点
    }
}
public class MySingleList {
    public Node head;//作用是，定位头节点的引用
    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        node.next = this.head;//这两行其实也包括了当链表为空的情况
        this.head = node;
//        if (this.head == null){
//            this.head = node;
//        }else{
//            node.next = this.head;
//            this.head = node;
//        }
    }
    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        if (this.head == null){
            this.head = node;
            return;
        }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }
    //求index-1位置的节点
    public Node searchPrev(int index) {
        int count = 0;
        Node cur = this.head;
        while (count < index-1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
         Node node = new Node(data);
         //首先得判断index的合法性
        if (index < 0 || index > this.size()){
            System.out.println("位置不合法");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node cur = searchPrev(index);
        node.next = cur.next;
        cur.next = node;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null){
            if (cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    public Node searchPrevNode(int key){
        Node cur = this.head;
        while (cur.next != null){
            if (cur.next.data == key){
                return cur;
            }
            cur = cur.next;
        }
        return null;//代表没有key的前驱
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
       //1.考虑头节点
        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        // 2.找需要删除节点的前驱
        Node prev = searchPrevNode(key);
        if (prev == null){
            return;
        }
        Node del = prev.next;//就是要删除节点的引用
        prev.next = del.next;
//        if (!contains(key)){
//            System.out.println("没有这个关键字");
//            return;
//        }
//        //如果是第一个
//        if (head.data == key){
//            this.head = head.next;
//        }
//        Node cur = this.head;
//        while (cur != null){
//            if (cur.next.data == key){
//                Node tmp = cur.next;
//                cur.next = cur.next.next;
//                tmp.next = null;
//                break;
//            }
//            cur = cur.next;
//        }
   }
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        while (contains(key)) {
            remove(key);
        }
    }
    //得到单链表的长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    //遍历链表
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + "  ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void clear() {
    }
}

