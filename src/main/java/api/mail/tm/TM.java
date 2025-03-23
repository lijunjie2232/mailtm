package api.mail.tm;

import api.mail.tm.Entity.DomainResponse;
import api.mail.tm.utils.HttpOkUtil;
import com.google.gson.Gson;

import javax.swing.undo.UndoManager;

/**
 * Hello world!
 */
public class TM {
//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//    }
    public static final String url = "https://api.mail.tm";
    public static final HttpOkUtil httpOkUtil = new HttpOkUtil();

    public DomainResponse getDomains(){
        String url = "https://api.mail.tm/domains";
        String result = httpOkUtil.get(url);
        Gson gson = new Gson();
        DomainResponse domains = gson.fromJson(result, DomainResponse.class);
        System.out.println(domains);
        return domains;
    }
}
