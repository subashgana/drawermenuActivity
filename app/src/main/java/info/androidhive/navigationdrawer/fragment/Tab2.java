package info.androidhive.navigationdrawer.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import info.androidhive.navigationdrawer.Adapter.FirstAdapter;
import info.androidhive.navigationdrawer.R;

/**
 * Created by Tharani on 08-10-2017.
 */

public class Tab2 extends Fragment {
    private RecyclerView recyclerView1;
    private int[] image = {R.drawable.burger, R.drawable.burgerone};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab2, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView1 = (RecyclerView) view.findViewById(R.id.recyclerView2);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getActivity()));


        FirstAdapter adapter = new FirstAdapter(getActivity(), image);
        recyclerView1.setAdapter(adapter);
    }
}
