package com.example.mohamed.splash.fragmentTabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mohamed.splash.Adapter.CanceledAdapter;
import com.example.mohamed.splash.Adapter.CompletedTabAdapter;
import com.example.mohamed.splash.R;

public class CompletedFragmentTab extends Fragment {


    public CompletedFragmentTab() {
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View view=  inflater.inflate(R.layout.fragment_completed_tab, container, false);

        RecyclerView recyclerView=(RecyclerView) view.findViewById(R.id.completed_recycler);
        CompletedTabAdapter adapter=new CompletedTabAdapter(getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}
