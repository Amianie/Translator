package com.example.translator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptermain extends BaseAdapter {
    private Context context;
    List<Spd> Family_members;

    public Adaptermain(Context context,List<Spd>Family_Members){
        this.context=context;
        this.Family_members=Family_Members;
    }
    @Override
    public int getCount() {
        return Family_members.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        TextView english_word=convertView.findViewById(R.id.baba);
        TextView kiswahili_word=convertView.findViewById(R.id.mama);
        ImageView Imageview=convertView.findViewById(R.id.dad);
         english_word.setText(Family_members.get(position).getEnglish_word());
         kiswahili_word.setText(Family_members.get(position).getKiswahili_word());

        return convertView;
    }
}
