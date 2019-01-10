package com.intern.ankan.internui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<MyViewHolder>{



    Context context;
    List<GetterSetter> list = Collections.EMPTY_LIST;
    LayoutInflater layoutInflater;

    private int prev = 0;

    Adapter(Context context,List<GetterSetter> list){
        this.context = context;
        this.list = list;
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vh = layoutInflater.inflate(R.layout.recycler_items,viewGroup,false);
        MyViewHolder holder = new MyViewHolder(vh);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int i) {
        GetterSetter gs = list.get(i);

        viewHolder.tv.setText(gs.getTitle());

        if(prev < i)
        AnimationUtils.wave(viewHolder,true);
        else
        AnimationUtils.wave(viewHolder,false);
        prev=i;


        //myViewHolder.br.setProgress(gs.getProgress());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
class MyViewHolder extends RecyclerView.ViewHolder{

    TextView tv;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        tv = (TextView)itemView.findViewById(R.id.textView3);
    }
}