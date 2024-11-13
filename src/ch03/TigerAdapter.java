package ch03;

// OuterTiger와 Cat, Mouse등과의 이질적인 것을 동일하게 맞추는 역할
public class TigerAdapter extends Animal {
    public TigerAdapter(OuterTiger outerTiger) {
        super(outerTiger.getFullname());
    }
}
