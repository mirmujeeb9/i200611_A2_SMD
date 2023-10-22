package com.faizanahmed.i200546;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    private List<Item> itemList;
    private Context context;

    public ItemAdapter(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.all_items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = itemList.get(position);
        // Bind data to views within the card
        holder.itemNameTextView.setText(item.getItemName());
        holder.hourlyRateTextView.setText(item.getHourlyRate() + "/hr");
        holder.descriptionTextView.setText(item.getDescription());
        holder.cityTextView.setText(item.getCity());
        // You can handle loading images and videos here
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemNameTextView;
        TextView hourlyRateTextView;
        TextView descriptionTextView;
        TextView cityTextView;
        ImageView cardViewImageView; // ImageView for the item's image (add to your card_item.xml)
        // Add ImageView for video if needed

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemNameTextView = itemView.findViewById(R.id.CardViewItemNameText1);
            hourlyRateTextView = itemView.findViewById(R.id.CardViewHourText1);
            descriptionTextView = itemView.findViewById(R.id.CardViewDateText1);
            cityTextView = itemView.findViewById(R.id.CardViewCityText1);
            cardViewImageView = itemView.findViewById(R.id.CardViewImage1);
            // Initialize ImageView for video if needed
        }
    }
}
