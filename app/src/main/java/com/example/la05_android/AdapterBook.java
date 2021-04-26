package com.example.la05_android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterBook  extends RecyclerView.Adapter<AdapterBook.BookViewHolder>{
    private List<Book> listBook;
    public AdapterBook(List<Book> listBook, MainActivity mainActivity) {
        this.listBook = listBook;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View bookView =
                inflater.inflate(R.layout.listbook_layout, parent, false);
        BookViewHolder viewHolder = new BookViewHolder(bookView,this);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        Book book=listBook.get(position);
        holder.tvNameBook.setText(book.getName());
        holder.imgBook.setImageResource(book.getImg());
    }

    @Override
    public int getItemCount() {
        return listBook.size();
    }

    public class BookViewHolder extends RecyclerView.ViewHolder{
        public final TextView tvNameBook;
        public final ImageView imgBook;
        final AdapterBook adapter;

        public BookViewHolder(View itemView, AdapterBook adapter) {
            super(itemView);
            tvNameBook=itemView.findViewById(R.id.tvNameBook);
            imgBook=itemView.findViewById(R.id.imgBook);
            this.adapter=adapter;
        }
    }
}
