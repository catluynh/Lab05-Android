package com.example.la05_android;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView recyclerView1;
    private AdapterProduct adapterProduct;
    private AdapterBook adapterBook;

    private List<Product> listProduct = new ArrayList<Product>();
    private List<Book> listBook = new ArrayList<Book>();

    protected void  onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        getListProduct();
        getListBook();

        recyclerView= findViewById(R.id.listProduct);
        adapterProduct = new AdapterProduct(listProduct, this);
        recyclerView.setAdapter(adapterProduct);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView1=findViewById(R.id.listBook);
        adapterBook = new AdapterBook(listBook,this);
        recyclerView1.setAdapter(adapterBook);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        LinearLayoutManager linearLayoutManager1=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL ,false);

        recyclerView1.setLayoutManager(linearLayoutManager1);
    }

    private void getListProduct() {
        listProduct.add(new Product("Cáp chuyển từ Cổng \n" +
                    "USB sang PS2...","69.900 đ",R.drawable.giacchuyen1));
        listProduct.add(new Product("Cáp chuyển từ Cổng \n" +
                "USB sang PS2...","69.900 đ",R.drawable.carbusbtops21));
        listProduct.add(new Product("Cáp chuyển từ Cổng \n" +
                "USB sang PS2...","69.900 đ",R.drawable.daucam1));
        listProduct.add(new Product("Cáp chuyển từ Cổng \n" +
                "USB sang PS2...","69.900 đ",R.drawable.dauchuyendoi1));
        listProduct.add(new Product("Cáp chuyển từ Cổng \n" +
                "USB sang PS2...","69.900 đ",R.drawable.daynguon1));
        listProduct.add(new Product("Cáp chuyển từ Cổng \n" +
                "USB sang PS2...","69.900 đ",R.drawable.dauchuyendoipsps21));
        listProduct.add(new Product("Cáp chuyển từ Cổng \n" +
                "USB sang PS2...","69.900 đ",R.drawable.dauchuyendoipsps21));
    }
    private void getListBook() {
        listBook.add(new Book("You can you will",R.drawable.canwill));
        listBook.add(new Book("Du lịch kiếm tiền",R.drawable.dulich));
        listBook.add(new Book("Sức  mạnh phi thường",R.drawable.sucmanh));
        listBook.add(new Book("Hường nội",R.drawable.huongnoi));
        listBook.add(new Book("Sống khổ sở",R.drawable.songkhoso));
        listBook.add(new Book("Start Up",R.drawable.startup));
        listBook.add(new Book("Lượng giác",R.drawable.luong_giac1));
    }
}
