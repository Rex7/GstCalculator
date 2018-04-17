package com.example.hp.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ProductList extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerAdapter;
    LinearLayoutManager linearLayoutManager;
    List<Product> productLists=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        recyclerView=findViewById(R.id.recycler);

        linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        RequestQueue myRequestQueue = VolleySingle.getInstance().getRequestQueue();
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET,
                "http://prajwalbhosale6.000webhostapp.com/getData.php", null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONArray array=response;




                    for (int i = 0; i < array.length(); i++) {

                        try {
                            JSONObject obj=array.getJSONObject(i);
                            productLists.add(new Product (obj.getString("product_name"), obj.getDouble("product_price"), obj.getInt("product_gst"),obj.getDouble("total")));

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }

                Log.v("productData",""+productLists.get(1).getProductName());
                    recyclerAdapter = new RecyclerViewAdapter( ProductList.this,productLists);

                    recyclerView.setVisibility(View.VISIBLE);
                    recyclerView.setAdapter(recyclerAdapter);
                    recyclerAdapter.notifyDataSetChanged();




            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });


        myRequestQueue.add(jsonArrayRequest);

    }
}
