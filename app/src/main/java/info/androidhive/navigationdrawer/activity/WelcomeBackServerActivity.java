
package info.androidhive.navigationdrawer.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import info.androidhive.navigationdrawer.R;


public class WelcomeBackServerActivity extends Activity implements View.OnClickListener {
    private Button pick, drop;
    Typeface face;
    TextView text,titletext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcomebackserver);
        // getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        pick = (Button) findViewById(R.id.pickupbutton);
        drop = (Button) findViewById(R.id.delivery);
        text = (TextView) findViewById(R.id.text);
        titletext = (TextView) findViewById(R.id.titletext);

        pick.setOnClickListener(this);
        drop.setOnClickListener(this);
        face = Typeface.createFromAsset(getAssets(),"fonts/OpenSans-Regular.ttf");
        text.setTypeface(face);
        pick.setTypeface(face);
        drop.setTypeface(face);
        titletext.setTypeface(face);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.pickupbutton:
                startActivity(new Intent(WelcomeBackServerActivity.this, MainActivity.class));
                break;
            case R.id.delivery:
                startActivity(new Intent(WelcomeBackServerActivity.this, MainActivity.class));
                break;
        }
    }
}
