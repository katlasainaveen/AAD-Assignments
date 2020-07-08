package com.example.assignment9;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Recycling_adapter extends RecyclerView.Adapter<Recycling_adapter.Recycling_viewholder> {

    int images[];
    String codename[];
    String version[];
    String api[];
    String releasedate[];

    public Recycling_adapter(int images[], String codename[], String version[], String api[], String releasedate[]) {
        this.images = images;
        this.codename = codename;
        this.version = version;
        this.api = api;
        this.releasedate = releasedate;
    }

    @NonNull
    @Override
    public Recycling_viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recycling_layout, parent, false);
        return new Recycling_viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Recycling_viewholder holder, int position) {
        String name = codename[position];
        String ver = version[position];
        String ap = api[position];
        String date = releasedate[position];
        int image = images[position];

        holder.image.setImageResource(image);
        holder.t1.setText(name);
        holder.t2.setText(ver);
        holder.t3.setText(ap);
        holder.t4.setText(date);
    }

    @Override
    public int getItemCount() {
        return codename.length;
    }

    public class Recycling_viewholder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView t1, t2, t3, t4;

        public Recycling_viewholder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.imageView);
            t1 = itemView.findViewById(R.id.codename);
            t2 = itemView.findViewById(R.id.version);
            t3 = itemView.findViewById(R.id.api);
            t4 = itemView.findViewById(R.id.releasedate);
        }
    }
}
