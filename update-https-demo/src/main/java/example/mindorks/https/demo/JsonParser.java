package example.mindorks.https.demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.$Gson$Types;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by janisharali on 04/04/17.
 */
public class JsonParser<T> {

    private Class<T> clazz;

    public JsonParser(Class<T> clazz) {
        this.clazz = clazz;
    }

    public List<T> parseList(String response) {
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        Type type = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, clazz);
        return gson.fromJson(response, type);
    }

    public T parseObject(String response) {
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        return gson.fromJson(response, clazz);
    }
}
