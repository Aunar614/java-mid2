package collection.link;

public class MyLinkedListV1Main {

    public static void main(String[] args) {
        MyLinkedListV1 list = new MyLinkedListV1();
        System.out.println("== 데이터 추가 ==");
        System.out.println(list);
        list.add("A");
        System.out.println(list);
        list.add("B");
        System.out.println(list);
        list.add("C");
        System.out.println(list);

        System.out.println("== 기능 사용 ==");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf('C') = " + list.indexOf("C"));
        System.out.println("list.set(2, 'Z') = " + list.set(2, 'Z'));
        System.out.println(list);

    }
}
