package com.example.hp.calculator;

/**
 * Created by hp on 16-04-2018.
 */


    import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
    import java.util.List;

/**
     * Created by Regis on 07-04-2018.
     */

    public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolders> {
        private List<Product> products;
        Context context;


        public RecyclerViewAdapter(Context context, List<Product>products) {
            this.context = context;
            this.products=products;
            Log.v("totalWorth",""+products.get(5).getProductName());

        }


        @Override
        public ViewHolders onCreateViewHolder( ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
            return new ViewHolders(view);
        }

        @Override
        public void onBindViewHolder(ViewHolders holder, final int position) {
            Log.v("product ","Count"+position);
            holder.productName.setText(products.get(position).getProductName());
            holder.productPrice.setText(String.valueOf(products.get(position).getProductPrice()));
            holder.productGst.setText(String.valueOf(products.get(position).getProductGst()));
            holder.total.setText(String.valueOf(products.get(position).getTotalCost()));
        }

        @Override
        public int getItemCount() {
            return products.size();

        }

          static class ViewHolders extends RecyclerView.ViewHolder {
            TextView productName, productPrice, productGst, total;
             ViewHolders(View view) {
                super(view);
                productName = view.findViewById(R.id.product_name);
                productGst = view.findViewById(R.id.product_gst);
                productPrice = view.findViewById(R.id.product_Price);
                total = view.findViewById(R.id.TotalCost);
            }
        }
    }

