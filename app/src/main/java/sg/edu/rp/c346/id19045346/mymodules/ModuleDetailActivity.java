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
        String modcode = ReceivedIntent.getStringExtra("Module Code");
        String modname = ReceivedIntent.getStringExtra("Module Name");
        int modyear = ReceivedIntent.getIntExtra("Academic Year",0);
        int modsem = ReceivedIntent.getIntExtra("Semester",0);
        int modcredit = ReceivedIntent.getIntExtra("Module Credit",0);
        String modvenue = ReceivedIntent.getStringExtra("Venue");
        if(modnum == 346) { //optional but to be safe
            code.setText("Module Code: " + modcode);
            name.setText("Module Name: " + modname);
            year.setText("Academic Year: " + modyear);
            sem.setText("Semester: " + modsem);
            credit.setText("Module Credit: " + modcredit);
            venue.setText("Venue: " + modvenue);
        }
        else if(modnum == 349) { //optional but to be safe
            code.setText("Module Code: " + modcode);
            name.setText("Module Name: " + modname);
            year.setText("Academic Year: " + modyear);
            sem.setText("Semester: " + modsem);
            credit.setText("Module Credit: " + modcredit);
            venue.setText("Venue: " + modvenue);
        }



        backk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
