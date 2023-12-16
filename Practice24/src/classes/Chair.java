package classes;

interface Chair {
    void stab();
}

class BrokenChair implements Chair {
    @Override
    public void stab() {
        System.out.println("Сломанный стул");
    }
}
class VictorianChair implements Chair {
    @Override
    public void stab() {
        System.out.println("Викторианский стул");
    }
}

class MagicChair implements Chair {
    @Override
    public void stab() {
        System.out.println("Магический стул");
    }
}
