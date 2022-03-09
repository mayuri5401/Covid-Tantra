package com.example.custom_navigation_drawer.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.custom_navigation_drawer.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
public class FeaturedAdappter extends  RecyclerView.Adapter<FeaturedAdappter.featuredviewholder>{
    ArrayList<Featured_Helperclass> FeaturedLocation;

    public FeaturedAdappter(ArrayList<Featured_Helperclass> featuredLocation) {
        FeaturedLocation = featuredLocation;
    }

    @NonNull
    @NotNull
    @Override
    public FeaturedAdappter.featuredviewholder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.featured_carddesign,parent,false);
        featuredviewholder featuredViewHolder=new featuredviewholder(view);
        return featuredViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull FeaturedAdappter.featuredviewholder holder, int position) {
        Featured_Helperclass featuredHelperclass=FeaturedLocation.get(position);
        holder.image.setImageResource(featuredHelperclass.getImage());
        holder.txttitle.setText(featuredHelperclass.getTitle());

    }

    @Override
    public int getItemCount() {
        return FeaturedLocation.size();
    }

    public class  featuredviewholder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView txttitle;

        public featuredviewholder(@NonNull @NotNull View itemView) {
            super(itemView);
            //hooks
            image=itemView.findViewById(R.id.featured_image);
            txttitle=itemView.findViewById(R.id.featured_title);

        }
    }
}



