package labs.anton.icenet;

import com.android.volley.VolleyError;

import java.util.Map;

/**
 * Created by anton on 10/15/14.
 */
public interface RequestCallback<T> {
    public void onRequestSuccess(T t, Map<String, String> headers);
    public void onRequestError(VolleyError error);
    public void onRequestTimeout();
}