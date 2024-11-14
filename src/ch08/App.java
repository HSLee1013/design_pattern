package ch08;

import ch08.pub.Pub;
import ch08.sub.Sub1;
import ch08.sub.Sub2;
import ch08.sub.SubListener;

// 옵저버 패턴 -> 콜백
public class App {
    public static void main(String[] args) {
        // 1. 객체 생성 init
        Pub pub = new Pub();
        SubListener sub1 = new Sub1();
        SubListener sub2 = new Sub2();

        pub.add(sub1);
        pub.add(sub2);

        // 2. 마트에 상품 입고하는 스레드
        new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            pub.income();
        }).start();

        // 3. 마트 스레드
        new Thread(() -> {
            while (true) {
                if (pub.value == null) {
                    System.out.println("상품 미입고..");
                } else {
                    pub.notifyChange(pub.value + " 입고됨");
                    break;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
