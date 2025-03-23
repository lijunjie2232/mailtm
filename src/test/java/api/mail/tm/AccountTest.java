package api.mail.tm;

import api.mail.tm.Entity.Account;
import api.mail.tm.Entity.DomainResponse;
import api.mail.tm.utils.HttpOkUtil;
import api.mail.tm.utils.RandomUtil;
import org.junit.jupiter.api.Test;

public class AccountTest {

    HttpOkUtil httpOkUtil = new HttpOkUtil();
    Account accoutn;


    @Test
    void createAccount() throws Exception {
        DomainResponse domainResponse =
        accoutn = new Account(RandomUtil.getName(12);+"@test.com","123456");

    }
}
