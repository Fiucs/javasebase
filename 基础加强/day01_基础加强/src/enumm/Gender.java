package enumm;

public class Gender {

    private final String desc;

    private Gender(String desc){
        this.desc = desc;
    }

    public final static Gender male = new Gender("男");

    public final static Gender female = new Gender("女");

//    public void m(){
//        male = new Gender("不男");
//    }

    public String getDesc() {
        return desc;
    }
}
