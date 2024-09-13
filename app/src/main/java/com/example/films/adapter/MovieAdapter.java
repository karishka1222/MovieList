//package com.example.films.adapter;
//
//import android.graphics.Movie;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.CheckBox;
//
//import com.example.films.MovieActivity;
//import com.example.films.R;
//
//import java.util.List;
//
//public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {
//
//    private List<Movie> movieList;
//    private MovieActivity activity;
//
//    public MovieAdapter(MovieAdapter activity) {
//        this.activity = activity.activity;
//    }
//
//    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View item = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.movie_item, parent, false);
//        return new ViewHolder(item);
//    }
//
//    public void onBindViewHolder(ViewHolder holder, int position) {
//        Movie movie = movieList.get(position);
//    }
//    public static class ViewHolder extends RecyclerView.ViewHolder {
//        CheckBox movie;
//
//        ViewHolder(View view) {
//            super(view);
//            movie = view.findViewById(R.id.checkbox);
//        }
//    }
//}
