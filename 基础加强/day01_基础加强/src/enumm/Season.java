package enumm;

public enum Season implements Info{


    SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("春春春春春春春春春");
        }
    },SUMMER("夏天","夏日炎炎"){
        @Override
        public void show() {
            System.out.println("夏夏夏夏夏夏夏夏夏夏");
        }
    },AUTUMN("秋天","秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋秋秋秋秋秋秋秋秋秋");
        }
    },WINNER("冬天","冬暖夏凉"){
        @Override
        public void show() {
            System.out.println("冬冬冬冬冬冬冬冬冬冬冬冬");
        }
    };

    private final String seasonName;
    private final String seasonDesc;


    private Season(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }


    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }


}
