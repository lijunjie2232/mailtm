package api.mail.tm;

import api.mail.tm.Entity.Account;
import api.mail.tm.service.AccountService;
import api.mail.tm.service.MessageService;
import api.mail.tm.utils.HttpOkUtil;
import okhttp3.OkHttpClient;
import org.junit.jupiter.api.Test;

public class MessageTest {
    @Test
    void headerTest(){
        HttpOkUtil httpOkUtil = new HttpOkUtil();
        httpOkUtil.setHeader("Authorization", "Bearer " + "123");
        MessageService ms = new MessageService(httpOkUtil);
        ms.testHeader();
        httpOkUtil.setHeader("Authorization",  "Bearer " + "321");
        ms.testHeader();
    }

    @Test
    void getMessagesTest() throws Exception{
        Account ac = new Account("aflwajfnbic1@indigobook.com", "123321");
        AccountService as = new AccountService(ac);
        MessageService ms = new MessageService(as.getHttpOkUtil());
        ms.getMessages();
    }
}
