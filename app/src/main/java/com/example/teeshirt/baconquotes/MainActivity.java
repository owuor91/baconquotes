package com.example.teeshirt.baconquotes;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.HashMap;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SliderLayout baconSliderShow = (SliderLayout)findViewById(R.id.slider);

        HashMap<String, Integer> baconslides = new HashMap<String, Integer>();
        baconslides.put("Quote 1",R.drawable.bacon);
        baconslides.put("Quote 2",R.drawable.bacon2);
        baconslides.put("Quote 3",R.drawable.bacon3);
        baconslides.put("Quote 4",R.drawable.bacon4);

        for (String name: baconslides.keySet()){
            TextSliderView baconSliderView = new TextSliderView(this);
            baconSliderView.description(name);
            baconSliderView.image(baconslides.get(name));

            baconSliderShow.addSlider(baconSliderView);
        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
