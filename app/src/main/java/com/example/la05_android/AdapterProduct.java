package com.example.la05_android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterProduct extends RecyclerView.Adapter<AdapterProduct.ProductViewHolder> {
    private List<Product> listProduct;

    public AdapterProduct(List<Product> listProduct, MainActivity mainActivity) {
        this.listProduct = listProduct;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View productView =
                inflater.inflate(R.layout.listroduct_layout, parent, false);

        ProductViewHolder viewHolder = new ProductViewHolder(productView,this);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
       Product product=listProduct.get(position);
        holder.tvName.setText(product.getName());
        holder.tvPrice.setText(product.getPrice());
        holder.img.setImageResource(product.getImg());

    }

    @Override
    public int getItemCount() {
        return listProduct.size();
    }


    public class ProductViewHolder extends RecyclerView.ViewHolder{
        public final TextView tvName;
        public final TextView tvPrice;
        public final ImageView img;
        final AdapterProduct mAdapter;

        public ProductViewHolder(View itemView,AdapterProduct adapter) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            img= itemView.findViewById(R.id.img8);
            this.mAdapter = adapter;
        }

    }
}
