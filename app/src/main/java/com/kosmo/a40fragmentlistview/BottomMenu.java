package com.kosmo.a40fragmentlistview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Fragment 클래스를 상속한 하단의 메뉴 부분
public class BottomMenu extends Fragment {

    private static String TAG = "iKosmo";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable  ViewGroup container, @Nullable  Bundle savedInstanceState) {

        Log.d(TAG,"BottomMenu class > oncreateView() called");
        return inflater.inflate(R.layout.bottom_menu, container, false);

    }
}
