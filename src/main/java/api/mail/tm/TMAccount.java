package api.mail.tm;

import api.mail.tm.Entity.Account;
import api.mail.tm.service.AccountService;
import api.mail.tm.service.MessageService;

public class TMAccount {
    private static AccountService accountService;
    private static MessageService messageService;
    public TMAccount(Account account) throws Exception {
        accountService = new AccountService(account);
        messageService = new MessageService(accountService.getHttpOkUtil());
    }

}
