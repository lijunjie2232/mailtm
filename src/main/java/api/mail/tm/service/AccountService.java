package api.mail.tm.service;

import api.mail.tm.Entity.*;
import api.mail.tm.TM;
import api.mail.tm.utils.HttpOkUtil;
import com.google.gson.Gson;
import lombok.Getter;

public class AccountService {
    @Getter
    private final HttpOkUtil httpOkUtil = new HttpOkUtil();
    private Account account;
    @Getter
    private Token token;

    public AccountService(Account account) throws Exception {
        this.account = account;
        try {
            this.createAccount();
        } catch (Exception e) {
        }
        this.refreshToken();
    }

    AccountResponse createAccount() throws Exception {
        DomainResponse domainResponse = DomainService.getDomains();
        if (domainResponse.getMember().isEmpty()) {
            throw new Exception("没有可用的域名");
        }
        Domain domain = domainResponse.getMember().get(0);
//        account = new Account(RandomUtil.getName(12) + "@" + domain.getDomain(), RandomUtil.getPwd(8));

        String result = httpOkUtil.post(TM.BaseUrl + "/accounts", new Gson().toJson(account));

        return new Gson().fromJson(result, AccountResponse.class);

    }


    public Token refreshToken() throws Exception {
        String result = httpOkUtil.post(TM.BaseUrl + "/token", new Gson().toJson(account));

        token = new Gson().fromJson(result, Token.class);
        httpOkUtil.setHeader("Authorization", "Bearer " + token.getToken());
        return token;
    }


    public AccountResponse refreshAccountInfo() throws Exception {

        String result = httpOkUtil.get(TM.BaseUrl + "/me");

        return new Gson().fromJson(result, AccountResponse.class);
    }


    public AccountResponse getAccountInfo() throws Exception {

        String result = httpOkUtil.get(TM.BaseUrl + "/accounts/" + token.getId());

        return new Gson().fromJson(result, AccountResponse.class);
    }

    public Boolean deleteAccount() throws Exception {

        return httpOkUtil.delete(TM.BaseUrl + "/accounts/" + token.getId());

    }
}
