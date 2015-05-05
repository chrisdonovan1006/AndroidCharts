package com.livebythecode.dvn.androidcharts;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView chartList = (ListView) findViewById(R.id.chartlist);
        String[] values = new String[] { "Shinobi Chart", "A-Chart Engine", "MP Android Chart",
                "Android Plot", "Tele-Rik Chart" };

        final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < values.length; ++i) {
            list.add(values[i]);
        }

        final StableArrayAdapter adapter = new StableArrayAdapter(this,
                android.R.layout.simple_list_item_1, list);
        chartList.setAdapter(adapter);

        chartList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, final View view,
                                    int position, long id) {
                final String item = (String) parent.getItemAtPosition(position);
                switch(item){
                    case "Shinobi Chart":
                        Intent intent = new Intent(MainActivity.this, ShinobiChart.class);
                        startActivity(intent);
                        finish();
                    break;
                    case "A-Chart Engine":
                        Intent intent1 = new Intent(MainActivity.this, AChartEngine.class);
                        startActivity(intent1);
                        finish();
                    break;
                    case "MP Android Chart":
                        Intent intent2 = new Intent(MainActivity.this, MPAndroidChart.class);
                        startActivity(intent2);
                        finish();
                    break;
                    case "Android Plot":
                        Intent intent3 = new Intent(MainActivity.this, AndroidPlot.class);
                        startActivity(intent3);
                        finish();
                    break;
                    case "Tele-Rik Chart":
                        Intent intent4 = new Intent(MainActivity.this, TeleRikChart.class);
                        startActivity(intent4);
                        finish();
                    break;
                    default:
                        Context context = getApplicationContext();
                        CharSequence text = "Incorrect Selection!!!!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                }

            }
        });

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

    private class StableArrayAdapter extends ArrayAdapter<String> {

        HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

        public StableArrayAdapter(Context context, int textViewResourceId,
                                  List<String> objects) {
            super(context, textViewResourceId, objects);
            for (int i = 0; i < objects.size(); ++i) {
                mIdMap.put(objects.get(i), i);
            }
        }

        @Override
        public long getItemId(int position) {
            String item = getItem(position);
            return mIdMap.get(item);
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }
    }
}
