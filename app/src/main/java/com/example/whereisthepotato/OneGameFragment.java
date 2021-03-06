package com.example.whereisthepotato;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class OneGameFragment extends Fragment {

    private int tabPosition;

    private static final String TAB_POSITION = "tab_position";

    public OneGameFragment() {
    }

    public static OneGameFragment newInstance(int position) {
        OneGameFragment fragment = new OneGameFragment();
        Bundle args = new Bundle();
        args.putInt(TAB_POSITION, position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = getArguments();
        if (bundle != null) {
            tabPosition = bundle.getInt(TAB_POSITION);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.game_detail, container, false);

        // TODO: load details into view; get them from firebase

        return rootView;
    }

}

