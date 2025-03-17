package com.example.freshmart;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.freshmart.adapters.LogListAdapter;
import com.example.freshmart.databinding.FragmentHomeLogsBinding;
import com.example.freshmart.model.LogList;

import java.util.ArrayList;
import java.util.Date;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeLogsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeLogsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeLogsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeLogsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeLogsFragment newInstance(String param1, String param2) {
        HomeLogsFragment fragment = new HomeLogsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_logs, container, false);
    }

    ArrayList<LogList> log_List;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        FragmentHomeLogsBinding binding = FragmentHomeLogsBinding.bind(view);


        log_List = new ArrayList<>();
        log_List.add(new LogList("Test", "Category", 2.00, 2.00, 2, new Date()));
        log_List.add(new LogList("Test 2", "Category", 2.00, 2.00, 2, new Date()));
        log_List.add(new LogList("Test 3", "Category", 2.00, 2.00, 2, new Date()));

        RecyclerView recyclerView = binding.logListRecyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new LogListAdapter(log_List));



    }
}