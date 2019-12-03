package com.mobile.azrinurvani.callapps;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CallAdapter extends RecyclerView.Adapter<CallAdapter.ViewHolder> {

    Context context;
    List<ContactModel> listContact;

    public CallAdapter(Context context, List<ContactModel> listContact) {
        this.context = context;
        this.listContact = listContact;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View v = LayoutInflater.from(context).inflate(R.layout.list_contact,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        holder.tName.setText(listContact.get(i).getName());
        holder.tPhone.setText(listContact.get(i).getPhone());
        holder.imgContact.setImageResource(listContact.get(i).getPhoto());
    }

    @Override
    public int getItemCount() {
        if (listContact!=null)
            return listContact.size();
        else
            return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tName,tPhone;
        ImageView imgContact;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tName = itemView.findViewById(R.id.nameContact);
            tPhone = itemView.findViewById(R.id.phoneContact);
            imgContact = itemView.findViewById(R.id.imgContact);

        }
    }
}
