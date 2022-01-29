package ch11_Enum;

public enum Transport {
    BUS(1200), TRAIN(30000), RENT(100000);
    private final int BASIC_FARE; //기본요금
    Transport(int basicFare){
        this.BASIC_FARE=basicFare;
    }

    public int fare(int cnt){
        switch(this){
            case BUS:
            case TRAIN:
                return BASIC_FARE*cnt;
            case RENT:
                return BASIC_FARE;
            default:
                throw new IllegalArgumentException("잘못된 교통수단입니다.");
        }
    }
}
