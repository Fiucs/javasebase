package cn.itcast.annotation.enumm;

public enum Season {

    SPRING("春天","蚊子咬"),SUMMER("夏天","透心凉"),AUTUMN("秋天","暖气开"),
    WINTER("冬天","衣服买");
    //枚举其实是对象 放在第一行 默认无参数
    private final String sname;
    private final String des;

    @Override
    public String toString() {
        return "Season{" +
                "sname='" + sname + '\'' +
                ", des='" + des + '\'' +
                '}';
    }

    Season(String sname, String des) {

        this.sname=sname;
        this.des=des;

    }

    //enum常见方法


}
