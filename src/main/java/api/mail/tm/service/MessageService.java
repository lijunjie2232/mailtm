package api.mail.tm.service;

import api.mail.tm.Entity.MessagesResponse;
import api.mail.tm.TM;
import api.mail.tm.utils.HttpOkUtil;
import com.google.gson.Gson;

import java.io.IOException;

public class MessageService {
    private HttpOkUtil httpOkUtil;
    public MessageService(HttpOkUtil httpOkUtil){
        this.httpOkUtil = httpOkUtil;
    }

    public void testHeader(){
        System.out.println(httpOkUtil.getHeader("Authorization"));
    }

    public void getMessages(){
        try {
            String url = TM.BaseUrl + "/messages";
            String json = httpOkUtil.get(url);
            MessagesResponse messagesResponse = new Gson().fromJson(json, MessagesResponse.class);
            System.out.println(messagesResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
