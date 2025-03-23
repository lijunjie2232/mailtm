package api.mail.tm.utils;

import http.Client;
import http.Http;
import http.Request;
import http.Response;
import http.exceptions.HttpException;
import java.io.IOException;

public class HttpokUtil {

    // 静态 Client 实例（用于保持会话，自动管理 Cookie）
    private static final Client client = Http.client();

    /**
     * GET 请求（保持会话）
     */
    public static String get(String url) throws IOException, HttpException {
        return get(url, null);
    }

    public static String get(String url, Request.Headers headers) throws IOException, HttpException {
        Request request = client.get(url);
        if (headers != null) {
            request.headers(headers);
        }
        Response response = request.send();
        return response.body().string();
    }

    /**
     * POST JSON 请求（保持会话）
     */
    public static String postJson(String url, String jsonBody) throws IOException, HttpException {
        return postJson(url, jsonBody, null);
    }

    public static String postJson(String url, String jsonBody, Request.Headers headers) throws IOException, HttpException {
        Request request = client.post(url).json(jsonBody);
        if (headers != null) {
            request.headers(headers);
        }
        Response response = request.send();
        return response.body().string();
    }

    /**
     * 清除会话（例如退出登录后重置 Cookie）
     */
    public static void clearSession() {
        client.close();
        client.reset(); // 假设存在重置方法（需参考具体库的 API）
    }
}