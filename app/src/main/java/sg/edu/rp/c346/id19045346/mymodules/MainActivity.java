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
                startActivity(intent);

            }
        });


        txtmod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("module",349);
                startActivity(intent);
            }
        });
    }
}
