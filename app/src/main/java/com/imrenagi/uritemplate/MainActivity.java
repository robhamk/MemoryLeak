package com.imrenagi.uritemplate;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.VolleyError;

import java.util.Map;

import labs.anton.icenet.IceNet;
import labs.anton.icenet.RequestCallback;


public class MainActivity extends ActionBarActivity {

    private TextView textView;
    private Button button;
    private UrlResponse mUrlResponse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.text);

        IceNet.connect()
                .createRequest()
                .get()
                .pathUrl("/testing")
                .fromJsonObject()
                .mappingInto(UrlResponse.class)
                .execute("Testing", new UrlCallback());
        }

    private class UrlCallback implements RequestCallback<UrlResponse> {

        @Override
        public void onRequestSuccess(UrlResponse urlResponse, Map<String, String> headers) {
            mUrlResponse = urlResponse;
        }

        @Override
        public void onRequestError(VolleyError error) {

        }

        @Override
        public void onRequestTimeout() {

        }
    }
}
