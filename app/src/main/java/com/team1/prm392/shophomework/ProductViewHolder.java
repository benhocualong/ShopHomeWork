package com.team1.prm392.shophomework;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductViewHolder extends RecyclerView.ViewHolder {

    private ImageView productImage;

    private TextView productName;
    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        bindingView();
        bindingAction();
    }

    private void bindingAction() {
        productImage = itemView.findViewById(R.id.productImage);
        productName = itemView.findViewById(R.id.productName);
    }

    private void bindingView() {
        productImage = itemView.findViewById(R.id.productImage);
        productName = itemView.findViewById(R.id.productName);
    }

    public void setProduct(Product product) {
        productImage.setImageResource(R.drawable.ic_launcher_background);
        productName.setText(product.getProductName());
    }
}
