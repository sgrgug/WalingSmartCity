package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * Created by Sagar Gurung on 1/9/2018.
 */

/*
 *RecyclerView.Adapter
 *RecyclerView.ViewHolder
 **/

public class TourismAreaAdapter extends RecyclerView.Adapter<TourismAreaAdapter.ProductViewHolder> {

    private Context mCtx;
    private List<TourismAreaList> tourismList;

    public TourismAreaAdapter(Context mCtx, List<TourismAreaList> tourismList) {
        this.mCtx = mCtx;
        this.tourismList = tourismList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout_tourism, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, final int position) {
        final TourismAreaList tourism = tourismList.get(position);


        holder.textViewTitleTour.setText(tourism.getTitleTour());
        holder.textViewLocationTourism.setText(tourism.getLocationTour());

        holder.imageViewTour.setImageDrawable(mCtx.getResources().getDrawable(tourism.getImageTour()));

        holder.relativeLayoutTour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mCtx, "You clicked " +tourism.getTitleTour(), Toast.LENGTH_SHORT).show();
                //Intent intentMyTourism = new Intent(mCtx, TourismDetails.class);
                //intentMyTourism.putExtra("title", tourism.getTitleTour());
                //intentMyTourism.putExtra("location", tourism.getLocationTour());
                //intentMyTourism.putExtra("longDesc", tourism.getLongDescTour());
                //intentMyTourism.putExtra("image", tourism.getImageTour());
                //mCtx.startActivity(intentMyTourism);
            }
        });


    }

    @Override
    public int getItemCount() {
        return tourismList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{

        ImageView imageViewTour;
        TextView textViewTitleTour, textViewLocationTourism;
        RelativeLayout relativeLayoutTour;

        public ProductViewHolder(View itemView) {
            super(itemView);


            imageViewTour = (ImageView) itemView.findViewById(R.id.imageViewTourism);
            textViewTitleTour = (TextView) itemView.findViewById(R.id.textViewTitleTourism);
            textViewTitleTour.getBackground().setAlpha(51);
            textViewLocationTourism = (TextView) itemView.findViewById(R.id.textViewLocationTourism);
            relativeLayoutTour = (RelativeLayout) itemView.findViewById(R.id.relativeLayoutTourism);
        }
    }
}
