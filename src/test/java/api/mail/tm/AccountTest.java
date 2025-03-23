package api.mail.tm;

import api.mail.tm.Entity.*;
import api.mail.tm.service.AccountService;
import api.mail.tm.service.DomainService;
import api.mail.tm.utils.HttpOkUtil;
import api.mail.tm.utils.RandomUtil;
import com.google.gson.Gson;
import okhttp3.Response;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    void accountServiceTest() throws Exception {
        Account account = new Account("aflwajfnbic1@indigobook.com", "123321");
        AccountService as = new AccountService(account);
        System.out.println(as.getToken());
        System.out.println(as.refreshAccountInfo());
        System.out.println(as.getAccountInfo());

//        System.out.println(as.getAccounts());
    }
}
