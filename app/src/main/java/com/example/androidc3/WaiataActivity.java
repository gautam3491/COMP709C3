package com.example.androidc3;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidc3.Adapter.GridOfCharAdapter;
import com.example.androidc3.Model.WaiataModel;

import java.util.ArrayList;

public class WaiataActivity extends AppCompatActivity {
    private ArrayList<WaiataModel> charList = new ArrayList<>();
    private GridOfCharAdapter gridOfCharAdapter;
    private RecyclerView charRecyclerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiata);

        //store the value in the form of array
        WaiataModel charModel0 = new WaiataModel(1,R.drawable.ekorekoeengaro, "E Kore Koe E Ngaro", "Zeus, the Lord of Heaven, is a ranged intelligence hero who functions almost solely as a nuker. He is usually played as a semi-carry ganker type hero, who instead of utilizing disables, focuses solely on delivering tremendous amounts of magical damage to his foes.", "Electric Shock","Attack + defence", R.raw.ekorekoe_1 );
        charList.add(charModel0);

        WaiataModel charModel1 = new WaiataModel(2,R.drawable.hemaimaiarohanatawhiao, "He Maimai Aroha na Tawhiao", "Lucifer, the Doom, is a melee strength hero with strong farming capabilities, good versatility, and one of the strongest single-target disables in the game. His very low starting armor makes him vulnerable to harassment, but his abilities and high health allow him to lane or even jungle quite effectively.", "Fire","Attack + defence + Carry", R.raw.ekorekoe_2 );
        charList.add(charModel1);
        gridOfCharAdapter = new GridOfCharAdapter(charList);
        charRecyclerview = findViewById(R.id.recyclerview);

        //        for grid
        charRecyclerview.setLayoutManager(new GridLayoutManager(this, 2));
        charRecyclerview.setItemAnimator(new DefaultItemAnimator());
        charRecyclerview.setAdapter(gridOfCharAdapter);

        //Toolbar
        Toolbar toolbarList = findViewById(R.id.toolbarList);
        toolbarList.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
//                CustomIntent.customType(view.getContext(), "right-to-left");
            }
        });
    }
}