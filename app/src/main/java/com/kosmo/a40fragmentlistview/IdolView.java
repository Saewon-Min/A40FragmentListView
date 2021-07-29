package com.kosmo.a40fragmentlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class IdolView extends LinearLayout {

    TextView textView1;//그룹명
    TextView textView2;//인원수

    /*
    LinearLayout을 상속한 후 생성자에서 레이아웃을 inflate 처리하고,
    텍스트뷰를 얻어온 후 필요한 데이터를 삽입 처리한다.
     */
    public IdolView(Context context) {
        super(context);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.idol_view, this, true);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
    }

    public void setName(String name) {
        textView1.setText(name);
    }

    public void setPerson(String pCount) {
        textView2.setText(pCount);
    }
}

