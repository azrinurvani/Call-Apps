package com.mobile.azrinurvani.callapps;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {

    View v;
    RecyclerView adapterRecycler;
    List<ContactModel>listContacts;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listContacts = new ArrayList<>();
        listContacts.add(new ContactModel("Avengers","+62 8756 890923",R.drawable.male));
        listContacts.add(new ContactModel("Captain America 1","+62 8756 890942",R.drawable.male));
        listContacts.add(new ContactModel("Captain America 2","+62 8756 890990",R.drawable.male));
        listContacts.add(new ContactModel("Cat Woman","+62 8756 890977",R.drawable.male));
        listContacts.add(new ContactModel("Spiderman","+62 8756 890999",R.drawable.male));
        listContacts.add(new ContactModel("Hulk","+62 8756 890923",R.drawable.male));
        listContacts.add(new ContactModel("Iron Man","+62 8756 778098",R.drawable.male));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.contact_fragment,container,false);

        adapterRecycler = (RecyclerView)v.findViewById(R.id.contactRecycler);
        CallAdapter callAdapter = new CallAdapter(getContext(),listContacts);
        adapterRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapterRecycler.setAdapter(callAdapter);
        return v;
    }

}
