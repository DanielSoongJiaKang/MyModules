package sg.edu.rp.c346.id19045346.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView code;
    TextView name;
    TextView year;
    TextView sem;
    TextView credit;
    TextView venue;
    Button backk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);


        code = findViewById(R.id.txtcode);
        name = findViewById(R.id.txtname);
        year = findViewById(R.id.txtyear);
        sem = findViewById(R.id.txtsem);
        credit = findViewById(R.id.txtcredit);
        venue = findViewById(R.id.txtvenue);
        backk = findViewById(R.id.goback);
        Intent ReceivedIntent = getIntent();
        int modnum = ReceivedIntent.getIntExtra("module",0);


        if(modnum == 346) {
            code.setText("Module Code: C346");
            name.setText("Module Name: Android Programming");
            year.setText("Academic Year: 2020");
            sem.setText("Semester: 1");
            credit.setText("Module Credit: 4");
            venue.setText("Venue: W66M");
        }
        else if(modnum == 349) {
            code.setText("Module Code: C349");
            name.setText("Module Name: iPad Programming");
            year.setText("Academic Year: 2020");
            sem.setText("Semester: 1");
            credit.setText("Module Credit: 4");
            venue.setText("Venue: W66M");
        }



        backk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
