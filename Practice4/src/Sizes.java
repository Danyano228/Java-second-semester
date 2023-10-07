public enum Sizes {
    XXS (32) {
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS (34),
    S (36),
    M (38),
    L (40);

    private final int euroSize;


    private Sizes(int eurosize) {
        this.euroSize = eurosize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }

    public int getSize() {
        return euroSize;
    }
}
