package ch07.pub;

import ch07.sub.SubListener;

import java.util.ArrayList;
import java.util.List;

public class Pub implements PubListener {

    // 1. 구독자 명단
    List<SubListener> subList = new ArrayList<>();

    @Override
    public void add(SubListener sub) {
        subList.add(sub);
    }

    @Override
    public void remove(SubListener sub) {
        subList.remove(sub);
    }

    // 2. 책임 : 물건이 들어오면, 구독자들에게 알림을 보낸다.
    @Override
    public void notifyChange(String msg) {
        // 5초 잠자기
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(".");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        // 구독자들에게 알림주기
        for (SubListener sub : subList) {
            sub.update(msg);
        }
    }
}
