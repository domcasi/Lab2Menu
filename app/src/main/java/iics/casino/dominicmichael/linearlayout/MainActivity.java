package iics.casino.dominicmichael.linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button NextButt =(Button) findViewById(R.id.button4);
        Button BackButt =(Button) findViewById(R.id.button3);

        NextButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(R.layout.activity_main=true)
                setContentView(R.layout.relative_layout);
                TextView TITLE = (TextView) findViewById(R.id.textView);
                TITLE.setText("Relative Layout");
                // relative layout
                Button RNextButt =(Button) findViewById(R.id.button4);
                RNextButt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //if(R.layout.activity_main=true)
                        setContentView(R.layout.constraint_layout);
                    }
                });
                //back, linear
                Button RBackButt =(Button) findViewById(R.id.button3);
                RBackButt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        setContentView(R.layout.activity_main);
                    }
                });
                //end
            }
        });

        BackButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                setContentView(R.layout.constraint_layout);
                TextView TITLE = (TextView) findViewById(R.id.textView);
                TITLE.setText("Relative Layout");
                // relative layout
                Button CNextButt =(Button) findViewById(R.id.button4);
                CNextButt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //if(R.layout.activity_main=true)
                        setContentView(R.layout.relative_layout);
                    }
                });
                //back, linear
                Button CBackButt =(Button) findViewById(R.id.button3);
                CBackButt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        setContentView(R.layout.activity_main);
                    }
                });
                //end
            }
        });

    }
}
