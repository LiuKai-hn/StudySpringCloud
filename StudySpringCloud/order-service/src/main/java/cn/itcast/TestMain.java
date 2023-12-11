package cn.itcast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMain {

    public static void main(String[] args) {
        String regex = "^(11|12|13|14|15|21|22|23|31|32|33|34|35|36|37|41|42|43|44|45|46|50|51|52|53|54|61|62|63|64|65|71|81|82)\\d{4}[A-Z\\d]{9}[A-Z\\d]{1}$";
        String code1 = "91310000788595428E";
        String code2 = "91110106MA0090PC0F7";
        String code3 = "310000000010345123";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(code1);
        Matcher matcher2 = pattern.matcher(code2);
        Matcher matcher3 = pattern.matcher(code3);
        if (matcher1.matches()) {
            System.out.println(code1 + "是一个有效的统一社会信用代码");
        } else {
            System.out.println(code1 + "不是一个有效的统一社会信用代码");
        }
        if (matcher2.matches()) {
            System.out.println(code2 + "是一个有效的统一社会信用代码");
        } else {
            System.out.println(code2 + "不是一个有效的统一社会信用代码");
        }
        if (matcher3.matches()) {
            System.out.println(code3 + "是一个有效的统一社会信用代码");
        } else {
            System.out.println(code3 + "不是一个有效的统一社会信用代码");
        }
    }
}
