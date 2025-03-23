package api.mail.tm;

import api.mail.tm.utils.HttpOkUtil;
import org.junit.jupiter.api.Test;

public class httpOkTest {
    HttpOkUtil httpOkUtil = new HttpOkUtil();

    @Test
    public void testGet() throws Exception {
        String url = "https://www.baidu.com";
        String result = httpOkUtil.get(url);
        System.out.println(result);
    }
}
