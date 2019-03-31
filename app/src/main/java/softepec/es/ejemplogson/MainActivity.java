package softepec.es.ejemplogson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button toJsonBtn, fromJsonBtn;
    House house1, house2, house3;
    Houses housesList;
    String json;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        toJsonBtn = findViewById(R.id.toJSON);
        fromJsonBtn = findViewById(R.id.fromJSON);

        house1 = new House("dir1", 11111, 1);
        house2 = new House("dir2", 22222, 2);
        house3 = new House("dir3", 33333, 3);

        housesList = new Houses();
        housesList.addHouse(house1);
        housesList.addHouse(house2);
        housesList.addHouse(house3);

        json = housesList.toJSON();
        Log.i("gsonExample", json);

        housesList.removeHouse(house3);

        toJsonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String innerJson = housesList.toJSON();
                Log.i("gsonExample", innerJson);
                tv.setText(innerJson);
            }
        });

        fromJsonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                housesList = housesList.fromJSON(json);
                Log.i("gsonExample", housesList.toString());
                tv.setText(housesList.toString());
            }
        });

    }




}
