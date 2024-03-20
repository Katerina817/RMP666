package com.example.rmp666;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatTextView;

public class BannerView extends LinearLayout {

    public BannerView(Context context) {
        super(context);
        init();
    }
    private void init() {
        //настройка внешнего вида баннера
        LayoutInflater inflater = LayoutInflater.from(getContext());
        inflater.inflate(R.layout.banner_layout, this, true);
        Button button = findViewById(R.id.knopkaA);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                // Запускаем активность
                getContext().startActivity(intent);
            }
        });
    }
}