package com.example.exampletest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class Fragment1 extends Fragment {

    private View view;
    private TextView tv_frag1;
    private Button btn_move;
    private String result;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_1, container, false);

        tv_frag1 = view.findViewById(R.id.tv_frag1);
        btn_move = view.findViewById(R.id.btn_move);

        if(getArguments() != null){
            result = getArguments().getString("fromFrag2");     //프래그먼트래2에서 보낸 값을 프래그먼트1에서 받는다.
            tv_frag1.setText(result);
        }

        btn_move.setOnClickListener(new View.OnClickListener() {        // 프래그먼트2로 이동
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();   // 무언가를 담을 준비를 할 수 있는 보따리 or 꾸러미
                bundle.putString("fromFrag1", "이진영 프래그먼트1");
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                Fragment2 fragment2 = new Fragment2();
                fragment2.setArguments(bundle);     // 프래그먼트2에 번들을 넣어서 보내준다
                transaction.replace(R.id.frameLayout, fragment2);    // Intent에서 startActivity같은 느낌이다. 프래그먼트를 전환시켜준다.
                transaction.commit();   //저장

            }
        });

        return view;
    }
}
