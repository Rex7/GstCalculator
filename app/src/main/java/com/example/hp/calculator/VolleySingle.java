package com.example.hp.calculator;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;


public class VolleySingle {
    private static VolleySingle volleySingle = null;
    private RequestQueue requestQueue;

    private VolleySingle() {
        requestQueue = Volley.newRequestQueue(MyApplication.getApplicationConext());
    }

    public static VolleySingle getInstance() {
        if (volleySingle == null) {
            volleySingle = new VolleySingle();
        }
        return volleySingle;
    }

    public RequestQueue getRequestQueue() {
        return requestQueue;
    }

}
