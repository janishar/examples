package example.mindorks.https.demo;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * Created by janisharali on 04/04/17.
 */
public class ApiHandler {

    private static final OkHttpClient mClient = new OkHttpClient();
    private static final String BASE_URL = "https://httpbin.org/";

    private ApiHandler() {
        // should not be instantiated publicly
    }

    public static SampleResponse getSampleResponse() {
        try {

            String url = BASE_URL + "get";

            System.out.println(url);

            Request request = new Request.Builder()
                    .url(url)
                    .build();

            Response response = mClient.newCall(request).execute();
            String responseString = response.body().string();
            System.out.println(responseString);

            JsonParser<SampleResponse> jsonParser = new JsonParser<>(SampleResponse.class);
            return jsonParser.parseObject(responseString);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
