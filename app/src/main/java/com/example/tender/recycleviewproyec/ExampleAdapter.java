package com.example.tender.recycleviewproyec;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExapleViewHolder> {
    private Context mContext;
    private ArrayList<ExampleItem> mExampleList;

    public ExampleAdapter (Context context, ArrayList<ExampleItem> exampleList){
        mContext = context;
        mExampleList = exampleList;
    }

    @NonNull
    @Override
    public ExapleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.example_item, parent,false);
        return new ExapleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ExapleViewHolder holder, int position) {
        ExampleItem currentItem = mExampleList.get(position);

        String imageUrl = currentItem.getImagerUrl();
        String creatorName = currentItem.getCreator();
        int likeCount = currentItem.getLikeCount();

        holder.mTextViewCreator.setText(creatorName);
        holder.mTexteViewLikes.setText("Likes: " + likeCount);
        Picasso.with(mContext).load(imageUrl).fit().centerInside().into(holder.mImageView);

    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public class ExapleViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView mTextViewCreator;
        public TextView mTexteViewLikes;

        public ExapleViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.image_view);
            mTextViewCreator = itemView.findViewById(R.id.text_view_creator);
            mTexteViewLikes = itemView.findViewById(R.id.text_view_likes);
        }
    }
}
