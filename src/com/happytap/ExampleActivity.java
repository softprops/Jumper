package com.happytap;

import java.util.Arrays;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.happytap.JumpDialog.OnJumpListener;

public class ExampleActivity extends Activity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    Toast.makeText(ExampleActivity.this, "hi", Toast.LENGTH_LONG);
    final Button btn = (Button) findViewById(R.id.push);
    btn.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        new JumpDialog(ExampleActivity.this, new OnJumpListener() {
        	public void onJump(CharSequence c) {
        		btn.setText("selected " + c);
        	    Toast.makeText(ExampleActivity.this, "selected " + c, Toast.LENGTH_LONG);
        	  }
        }).only(
            Arrays.asList("J", "U", "M", "P")).inRowsOf(6).show();
      }
    });
  }

  
}