package classes;

abstract class ChairFactory<T extends Chair> {
    public abstract T createChair();
}

class BrokenChairFactory extends ChairFactory<BrokenChair> {
    @Override
    public BrokenChair createChair() {
        return new BrokenChair();
    }
}

class VictorianChairFactory extends ChairFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}

class MagicChairFactory extends ChairFactory {
    @Override
    public Chair createChair() {
        return new MagicChair();
    }
}