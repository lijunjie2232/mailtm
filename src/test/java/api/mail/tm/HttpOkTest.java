package api.mail.tm;

import api.mail.tm.Entity.DomainResponse;
import api.mail.tm.utils.HttpOkUtil;
import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

public class HttpOkTest {
    HttpOkUtil httpOkUtil = new HttpOkUtil();

    @Test
    void testGet() throws Exception {
//        String url = "https://www.baidu.com";
        String url = "https://api.mail.tm/domains";
        String result = httpOkUtil.get(url);
        System.out.println(result);
    }

    @Test
    void testGetDomains() throws Exception {
        String url = "https://api.mail.tm/domains";
        String result = httpOkUtil.get(url);
        Gson gson = new Gson();
        DomainResponse domains = gson.fromJson(result, DomainResponse.class);
        System.out.println(domains);
    }
}
