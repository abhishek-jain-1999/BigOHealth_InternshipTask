package com.example.bigohealthinternshiptask;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bigohealthinternshiptask.ListFragment.OnListFragmentInteractionListener;
import com.example.bigohealthinternshiptask.dataclass.PatAppData;
import com.example.bigohealthinternshiptask.dummy.DummyContent.DummyItem;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class AppointmentRecyclerViewAdapter extends RecyclerView.Adapter<AppointmentRecyclerViewAdapter.ViewHolder> {

    private final List<PatAppData> mValues;
    Context  context;

    public AppointmentRecyclerViewAdapter(List<PatAppData> items, Context context) {
        mValues = items;
        this.context=context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_appoint, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        holder.doc_name.setText(mValues.get(position).getDocName());
        holder.pat_name.setText(mValues.get(position).getPatName());
        holder.age.setText(""+mValues.get(position).getPatAge());
        String spec=mValues.get(position).getDocSpecialisation();
        if(spec.length()>30){
            String set= spec.substring(0,30);
            for(int i=30;i<spec.length();i++){
                if(spec.charAt(i)!=' '&&spec.charAt(i)!=','){
                    set=set+spec.charAt(i);
                }else{
                    break;
                }
            }
            spec=set;
        }

        holder.spec.setText(spec);
        holder.add.setText(mValues.get(position).getPatAddress());
        holder.date.setText(mValues.get(position).getDate());
        holder.time.setText(mValues.get(position).getSlot());
        Picasso.get().load(mValues.get(position).getDocImgUrl()).into(holder.imageView);

        String finalSpec = spec;

        holder.doc_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DoctorDetailActivity.class);

                intent.putExtra("for", "app");
                intent.putExtra("name", mValues.get(position).getDocName());
                intent.putExtra("pat_name", mValues.get(position).getPatName());
                String add= ((mValues.get(position).getPatAddress().length()>=1)?mValues.get(position).getPatAddress():"");

                intent.putExtra("add", add);
                intent.putExtra("spec", finalSpec);
                intent.putExtra("img", mValues.get(position).getDocImgUrl());
                intent.putExtra("age",""+ mValues.get(position).getPatAge());
                intent.putExtra("time", mValues.get(position).getSlot());
                intent.putExtra("date", mValues.get(position).getDate());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
         TextView doc_name,pat_name,spec,age,add,date,time;
        ImageView imageView;


        public ViewHolder(View view) {
            super(view);
            mView = view;
            doc_name = (TextView) view.findViewById(R.id.name_d);
            pat_name = (TextView) view.findViewById(R.id.pat_name);
            spec = (TextView) view.findViewById(R.id.spec);
            age = (TextView) view.findViewById(R.id.pat_age);
            add = (TextView) view.findViewById(R.id.pat_address);
            date = (TextView) view.findViewById(R.id.date);
            time = (TextView) view.findViewById(R.id.time);
            imageView=view.findViewById(R.id.doc_img_d);

        }

    }
}
