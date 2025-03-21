package com.example.freshmart;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.example.freshmart.adapters.ItemListAdapter;
import com.example.freshmart.databinding.FragmentHomeItemsBinding;
import com.example.freshmart.model.ItemList;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeItemsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeItemsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeItemsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeItemsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeItemsFragment newInstance(String param1, String param2) {
        HomeItemsFragment fragment = new HomeItemsFragment();
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
        return inflater.inflate(R.layout.fragment_home_items, container, false);
    }

    public ArrayList<ItemList> item_List;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        FragmentHomeItemsBinding binding = FragmentHomeItemsBinding.bind(view);

        item_List = new ArrayList<>();

        item_List.add(new ItemList("Test", 2.00, 2.00, "Category", 2));
        item_List.add(new ItemList("Test 2", 2.00, 2.00, "Category", 2));
        item_List.add(new ItemList("Test 3", 2.00, 2.00, "Category", 2));
        RecyclerView recyclerView = binding.itemListRecyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new ItemListAdapter(item_List));

        binding.itemAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment addItemFragment = new AddItemFragment();
                addItemFragment.show(getActivity().getSupportFragmentManager(), "Add Item");
            }
        });
    }
}