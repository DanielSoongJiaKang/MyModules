package sg.edu.rp.c346.id19045346.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtmod1;
    TextView txtmod2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtmod1 = findViewById(R.id.txtAP);
        txtmod2 = findViewById(R.id.txtPP);


        txtmod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("module",346);

                intent.putExtra("Module Code","C346");
                intent.putExtra("Module Name","Android Programming");
                intent.putExtra("Academic Year", 2020);
                intent.putExtra("Semester" ,1);
                intent.putExtra("Module Credit",4);
                intent.putExtra("Venue","W66M");
                startActivity(intent);

            }
        });


        txtmod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("module",349);
                intent.putExtra("Module Code","C349");
                intent.putExtra("Module Name","iPad Programming");
                intent.putExtra("Academic Year", 2020);
                intent.putExtra("Semester" ,1);
                intent.putExtra("Module Credit",4);
                intent.putExtra("Venue","W66M");

                startActivity(intent);
            }
        });
    }
}
