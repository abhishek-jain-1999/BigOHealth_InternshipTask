package com.example.bigohealthinternshiptask;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bigohealthinternshiptask.DoctorListFragment.OnListFragmentInteractionListener;
import com.example.bigohealthinternshiptask.dataclass.Data;
import com.example.bigohealthinternshiptask.dummy.DummyContent.DummyItem;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */

public class MyDoctorListRecyclerViewAdapter extends RecyclerView.Adapter<MyDoctorListRecyclerViewAdapter.ViewHolder> {

    private final List<Data> mValues;
    Context context;

    public MyDoctorListRecyclerViewAdapter(List<Data> items) {
        mValues = items;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_doctorlist, parent, false);
        context = parent.getContext();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.name.setText(mValues.get(position).getDoc_firstname()
                + " " + mValues.get(position).getDoc_middlename()
                + " " + mValues.get(position).getDoc_lastname());
        holder.exp.setText(mValues.get(position).getExperience() + " years of Experience");
        String spec=mValues.get(position).getSpecialisation();
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
        holder.city.setText(mValues.get(position).getCity());
        Picasso.get().load(mValues.get(position).getDoc_img_url()).into(holder.img);

        String finalSpec = spec;
        holder.view_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DoctorDetailActivity.class);

                intent.putExtra("for", "detail");
                intent.putExtra("name", mValues.get(position).getDoc_firstname()
                        + " " + mValues.get(position).getDoc_middlename()
                        + " " + mValues.get(position).getDoc_lastname());
                String add= ((mValues.get(position).getAddress_line1().length()>=1)?mValues.get(position).getAddress_line1():"") +","+
                        ((mValues.get(position).getAddress_line2().length()>=1)?mValues.get(position).getAddress_line2():"")+","+mValues.get(position).getCity();

                intent.putExtra("add", add);
                intent.putExtra("spec", finalSpec);
                intent.putExtra("fees", ""+mValues.get(position).getDoc_fee());
                intent.putExtra("img", mValues.get(position).getDoc_img_url());
                intent.putExtra("award", mValues.get(position).getAwards());
                intent.putExtra("time", mValues.get(position).getGeneral_slot());
                intent.putExtra("about", mValues.get(position).getAbout());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        View mView;
        TextView name, exp, spec, city, view_p;
        ImageView img;


        public ViewHolder(View view) {
            super(view);
            mView = view;
            name = (TextView) view.findViewById(R.id.name_d);
            view_p = (TextView) view.findViewById(R.id.view_p);
            exp = (TextView) view.findViewById(R.id.exp);
            spec = (TextView) view.findViewById(R.id.spec);
            city = (TextView) view.findViewById(R.id.city);
            img = view.findViewById(R.id.doc_img_d);
        }


    }
}
