package com.incapp.apiexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MovieListAdaptor extends ArrayAdapter<MoviesResponse.Movie> {

    List<MoviesResponse.Movie> list;

    public MovieListAdaptor(@NonNull Context context, List<MoviesResponse.Movie> list) {
        super(context, R.layout.row_for_movies_list);

        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {

            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.row_for_movies_list, null);

            ImageView imageView = convertView.findViewById(R.id.imageview);
            TextView textViewtitle = convertView.findViewById(R.id.textview_movietitle);
            TextView textViewdesc = convertView.findViewById(R.id.textview_moviedesc);
            TextView textViewrating = convertView.findViewById(R.id.textview_rating);

            Glide
                    .with(getContext())
                    .load(list.get(position).getLargeCoverImage())
                    .into(imageView);

            textViewtitle.setText(list.get(position).getTitle());
            textViewdesc.setText(list.get(position).getDescriptionFull());
            textViewrating.setText(list.get(position).getRating().toString());

        }
        return convertView;
    }

}
