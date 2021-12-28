package com.example.foodshopautomation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link UserHomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UserHomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    RecyclerView RecyclerMenu;
    ViewFlipper flipper;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public UserHomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment UserHomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static UserHomeFragment newInstance(String param1, String param2) {
        UserHomeFragment fragment = new UserHomeFragment();
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
        View view = inflater.inflate(R.layout.fragment_user_home, container, false);

       flipper = view.findViewById(R.id.flipper);

       int[] img = {R.drawable.bg, R.drawable.bg};

       for (int i=0; i<img.length ; i++){
           setImage(img[i]);
       }

       RecyclerMenu = view.findViewById(R.id.recycle_menu);

       RecyclerMenu.setLayoutManager(new LinearLayoutManager(getContext()));

       myAdapter adapter = new myAdapter(dataqueue());
       RecyclerMenu.setAdapter(adapter);
       return view;

}

    private ArrayList<Model> dataqueue() {
        ArrayList<Model> holder = new ArrayList<>();

        Model obj1 = new Model("Pav Bhaji", "45", "Best Selling Item", R.drawable.img1);
        holder.add(obj1);

        Model obj2 = new Model("Veg Biryani", "60", "Special One", R.drawable.img2);
        holder.add(obj2);

        Model obj3 = new Model("Pulav", "99", "Try it", R.drawable.im3);
        holder.add(obj3);

        Model obj4 = new Model("Vada Usal", "47", "Nasta", R.drawable.img4);
        holder.add(obj4);

        Model obj5 = new Model("Chicken Biryani", "68", "Non Veg", R.drawable.img5);
        holder.add(obj5);

        Model obj6 = new Model("Pizza", "46", "Junk Food", R.drawable.img6);
        holder.add(obj6);

        Model obj7 = new Model("Shihi Dish", "75", "Special one", R.drawable.img7);
        holder.add(obj7);

        Model obj8 = new Model("Vada Pav", "68", "Best Selling Item", R.drawable.img8);
        holder.add(obj8);

        Model obj9 = new Model("Fried Rice", "56", "Best Selling Item", R.drawable.img9);
        holder.add(obj9);

        Model obj10 = new Model("Chines", "34", "Best Selling Item", R.drawable.img10);
        holder.add(obj10);

        return holder;
    }

    private void setImage(int i) {
        ImageView image = new ImageView(getContext());

        image.setImageResource(i);

        flipper.addView(image);
        flipper.setAutoStart(true);
        flipper.setFlipInterval(3000);

        flipper.setInAnimation(getContext(), android.R.anim.slide_in_left);
        flipper.setOutAnimation(getContext(), android.R.anim.slide_out_right);
        
    }
    }