package onlyme.laboratory.java;

import org.apache.commons.lang3.StringUtils;

public class Test {

    public static void main(String[] args) {
        System.out.println(lPaddingZeroString("999992", 4));
        System.out.println(lPaddingZeroString("99992", 4));
        System.out.println(lPaddingZeroString("9992", 4));
        System.out.println(lPaddingZeroString("992", 4));
        System.out.println(lPaddingZeroString("92", 4));
        System.out.println(lPaddingZeroString("2", 4));


        System.out.println(StringUtils.leftPad("999992", 4,'0'));
        System.out.println(StringUtils.leftPad("99992", 4,'0'));
        System.out.println(StringUtils.leftPad("9992", 4,'0'));
        System.out.println(StringUtils.leftPad("992", 4,'0'));
        System.out.println(StringUtils.leftPad("92", 4,'0'));
        System.out.println(StringUtils.leftPad("2", 4,'0'));

        System.out.println(StringUtils.leftPad("999992", 4));
        System.out.println(StringUtils.leftPad("99992", 4));
        System.out.println(StringUtils.leftPad("9992", 4));
        System.out.println(StringUtils.leftPad("992", 4));
        System.out.println(StringUtils.leftPad("92", 4));
        System.out.println(StringUtils.leftPad("2", 4));
    }

    public static String lPaddingZeroString(String str, int len) {
        StringBuilder rtn = new StringBuilder("" + str);
        byte[] b = rtn.toString().getBytes();
        int iTmp = len - b.length;
        for (int i = 0; i < iTmp; i++) {
            rtn.insert(0, "0");
        }
        return rtn.toString();
    }


}
