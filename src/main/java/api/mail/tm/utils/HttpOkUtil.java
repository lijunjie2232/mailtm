package api.mail.tm.utils;

import com.google.gson.Gson;
import okhttp3.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class HttpOkUtil {

    private Map<String, String> headers = new HashMap<>();
    private final Gson gson = new Gson();

    private static final OkHttpClient client = new OkHttpClient.Builder().cookieJar(new CookieJar() {
        private final HashMap<HttpUrl, List<Cookie>> cookieStore = new HashMap<>();

        @Override
        public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
            cookieStore.put(url, cookies);
        }

        @Override
        public List<Cookie> loadForRequest(HttpUrl url) {
            List<Cookie> cookies = cookieStore.get(url);
            return cookies != null ? cookies : new ArrayList<>();
        }
    }).connectTimeout(10, TimeUnit.SECONDS).readTimeout(30, TimeUnit.SECONDS).build();

    public void setHeader(String key, String value) {
        headers.put(key, value);
    }

    public String getHeader(String key) {
        return headers.get(key);
    }

    public void deleteHeader(String key) {
        headers.remove(key);
    }

    public String get(String url) throws IOException {
        Request request = new Request.Builder().url(url).headers(Headers.of(headers)) // 添加 headers
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            return response.body().string();
        }
    }

    public String post(String url, String json) throws IOException {
        MediaType JSON = MediaType.get("application/json; charset=utf-8");
        RequestBody body = RequestBody.create(json, JSON);
        Request request = new Request.Builder().url(url).post(body).headers(Headers.of(headers)) // 添加 headers
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            return response.body().string();
        }
    }


    public Boolean delete(String url) throws IOException {
        Request request = new Request.Builder().url(url).delete().headers(Headers.of(headers)) // 添加 headers
                .build();
        try (Response response = client.newCall(request).execute()) {
            if (response.code() == 204) {
//                System.out.println("删除成功");
                return true;
            } else {
                System.out.println("delete return with code " + response.code());
                return false;
            }
        }
    }
}
