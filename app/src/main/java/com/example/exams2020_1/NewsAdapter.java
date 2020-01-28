package com.example.exams2020_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;

public class NewsAdapter extends ArrayAdapter<Article> {

    private ArrayList<Article> articles;
    private Context context;

    public NewsAdapter(Context context, ArrayList<Article> objects) {
        super(context, 0, objects);
        this.articles = objects;
        this.context = context;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;

        Article article = articles.get(position);

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        rowView = inflater.inflate(R.layout.list_item_article, null);

        TextView title = rowView.findViewById(R.id.titleTxt);
        TextView source = rowView.findViewById(R.id.sourceTxt);
        TextView description = rowView.findViewById(R.id.descriptionTxt);

        title.setText(article.getTitle());
        source.setText(article.getUrl());
        description.setText(article.getDescription());

        return  rowView;
    }

}
