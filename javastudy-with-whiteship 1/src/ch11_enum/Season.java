package ch11_enum;

enum Season {
    SPRING(20){
        @Override
        void rangeTemperature(int range) {
            System.out.println("봄의 평균 기온은 "+(avgTemperature-range)+ " ~ " + (avgTemperature+range) +" 도 입니다.");
        }
    },
    SUMMER(33){
        @Override
        void rangeTemperature(int range) {
            System.out.println("여름의 평균 기온은 "+(avgTemperature-range)+ " ~ " + (avgTemperature+range) +" 도 입니다.");
        }
    },
    FALL(15){
        @Override
        void rangeTemperature(int range) {
            System.out.println("가을의 평균 기온은 "+(avgTemperature-range)+ " ~ " + (avgTemperature+range) +" 도 입니다.");
        }
    },
    WINTER(-3){
        @Override
        void rangeTemperature(int range) {
            System.out.println("겨울의 평균 기온은 "+(avgTemperature-range)+ " ~ " + (avgTemperature+range) +" 도 입니다.");
        }
    };

    protected final int avgTemperature;
    Season(int avgTemperature){
        this.avgTemperature=avgTemperature;
    }


    abstract void rangeTemperature(int range);
}
