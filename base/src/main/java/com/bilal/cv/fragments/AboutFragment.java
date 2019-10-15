package com.bilal.cv.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bilal.cv.adapters.AboutAdapter;
import com.bilal.cv.base.R;
import com.bilal.cv.model.DemoItem;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {
    public AboutFragment() {
        // Required empty public constructor
    }
    public static AboutFragment newInstance() {
        AboutFragment fragment = new AboutFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        RecyclerView recyclerViewDemo = view.findViewById(R.id.recyclerViewDemo);
        recyclerViewDemo.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewDemo.setAdapter(new AboutAdapter(feedItems(), getContext()));
        return view;
    }
    private List<DemoItem> feedItems() {
        String Titles = "about Section" ;
        List<DemoItem> demoItems = new ArrayList<>();
                DemoItem demoItem = new DemoItem(Titles);
                demoItems.add(demoItem);
                return demoItems;
    }
}