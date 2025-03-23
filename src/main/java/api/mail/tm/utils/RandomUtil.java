package api.mail.tm.utils;

import java.util.ArrayList;
import java.util.List;

public class RandomUtil {
    final static String PwdChar = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*-_+";
    final static String NameChar = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static int getRandom(int max) {
        int range = max;
        return (int) Math.floor((Math.random() * range));
    }

    public static int getRandom(int min, int max) {
        int range = max - min;
        return (int) Math.floor((Math.random() * range)) + min;
    }

    public static List<Integer> getRandom(int min, int max, int len) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            list.add(RandomUtil.getRandom(min, max));
        }
        return list;
    }

    public static String getPwd(int len) {
        StringBuffer sb = new StringBuffer();
        List<Integer> list = RandomUtil.getRandom(0, PwdChar.length(), len);
        for (int i = 0; i < 8; i++) {
            char ch = PwdChar.charAt(list.get(i));
            sb.append(ch);
        }
        return sb.toString();
    }

    public static String getName(int len) {
        StringBuffer sb = new StringBuffer();
        List<Integer> list = RandomUtil.getRandom(0, NameChar.length(), len);
        for (int i = 0; i < 8; i++) {
            char ch = NameChar.charAt(list.get(i));
            sb.append(ch);
        }
        return sb.toString();
    }

}
