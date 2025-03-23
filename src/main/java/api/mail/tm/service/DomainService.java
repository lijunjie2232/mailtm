package api.mail.tm.service;

import api.mail.tm.Entity.DomainResponse;
import api.mail.tm.TM;
import api.mail.tm.utils.HttpOkUtil;
import com.google.gson.Gson;

import java.io.IOException;

public class DomainService {
    public static final HttpOkUtil httpOkUtil = new HttpOkUtil();

    public static DomainResponse getDomains() throws IOException {
        String url = TM.BaseUrl + "/domains";
        String result = httpOkUtil.get(url);
        Gson gson = new Gson();
        DomainResponse domains = gson.fromJson(result, DomainResponse.class);
        return domains;
    }
}
