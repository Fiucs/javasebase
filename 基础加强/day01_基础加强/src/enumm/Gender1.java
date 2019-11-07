package enumm;

public enum  Gender1 {

   male ("男"),female("女");



    private final String desc;

    private Gender1(String desc){
        this.desc = desc;
    }


//    public void m(){
//        male = new Gender("不男");
//    }

    public String getDesc() {
        return desc;
    }
}
