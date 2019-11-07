public class Test01 {
    public static void main(String[] args) {
        String regex="20\\d\\d";

        System.out.println("2019".matches(regex));
        System.out.println("2119".matches(regex));
        System.out.println("20019".matches(regex));

        //匹配规则
//     \s 可以匹配空格、制表符、换页符等空白字符的其中任意一个
        //String replaceAll​(String regex, String replacement)
        //匹配正则表达式规则
        System.out.println("//-------匹配正则表达式规则------");
        String re1="abc";

        String re2="a\\&c";

        System.out.println("a&c".matches(re2));
        System.out.println("a&$c".matches(re2));
        System.out.println("匹配任意字符");
        //匹配规则更多的是模糊匹配。

        //.匹配一个任意字符

        //"abc"，因为.可以匹配字符b；
        //"a&c"，因为.可以匹配字符&；
        //"acc"，因为.可以匹配字符c。
        String re3="a.b";
        System.out.println("aaa".matches(re3));

        //匹配数字
        //匹配0~9这样的数字，可以用\d匹配。例如，正则表达式00\d可以匹配：

        //匹配常用字符,用\w可以匹配一个字母、数字或下划线

        //匹配空格字符  用\s可以匹配一个空格字符，
        // 注意空格字符不但包括空格，还包括tab字符

        //匹配非数字  \D则匹配一个非数字
        //00\d可以匹配的字符串"007"，"008"等，00\D是不能匹配的。













    }
}
