package com.team1.prm392.shophomework;

import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private List<Product> productData;

    private RecyclerView recyclerView;

    private void fakeProductData() {
        productData = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            productData.add(new Product("Cao Nhat Long " + i));
        }
    }

    private void bindingView() {
        recyclerView = findViewById(R.id.listProduct);
    }

    private void bindingAction() {
    }

    private void initRecyclerView() {
        ProductAdapter adapter = new ProductAdapter(productData);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Shop");
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        fakeProductData();
        bindingView();
        bindingAction();
        initRecyclerView();
        Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
    }
}