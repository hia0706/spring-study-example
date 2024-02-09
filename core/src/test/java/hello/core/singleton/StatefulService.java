package hello.core.singleton;

public class StatefulService {

//    private int price; // 상태 유지하는 필드

    public int order(String item, int price) {
        System.out.println("item = " + item + ", price = " + price);
//        this.price = price; // 여기가 문제!!
        return price;
    }

//    public int getPrice() {
//        return price;
//    }
}
