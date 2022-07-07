package com.example.translator;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class family extends AppCompatActivity {
    ListView listView;
    List<Spd> Family_members;
    Adaptermain mainadapter;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        listView=findViewById(R.id.family_list);

        Family_members=new ArrayList<>();
        Family_members.add(new Spd("Patrick", "Chessa",R.drawable.dad,R.raw.baba));
        Family_members.add(new Spd("Ken", "Michuki",R.drawable.brother,R.raw.brother));
        Family_members.add(new Spd("Sheila", "Kemboi",R.drawable.mother,R.raw.mother));
        Family_members.add(new Spd("Terry", "Ann",R.drawable.aunt,R.raw.aunt));
        Family_members.add(new Spd("Stacy","Jacqueen",R.drawable.girl,R.raw.girl));
        Family_members.add(new Spd("Camilla","Makira",R.drawable.grandmother,R.raw.shangazi));


        mainadapter=new Adaptermain(getApplicationContext(),Family_members);
      //  ArrayAdapter<String>adapter=new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,Family_members);
      listView.setAdapter(mainadapter);

      listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              Spd object1=Family_members.get(position);
              mediaPlayer=MediaPlayer.create(getApplicationContext(),object1.getAudio());
              mediaPlayer.start();


          }
      });

       // listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          //  @Override
          //  public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //    Toast.makeText(getApplicationContext(),"you sele")
          //  }
      //  });

    }
    public void releasemethod(){
        if (mediaPlayer!=null)
            mediaPlayer.release();
        mediaPlayer=null;
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
}