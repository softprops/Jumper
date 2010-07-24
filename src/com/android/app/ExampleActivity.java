package com.android.app;

import java.util.Arrays;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.app.JumpDialog.OnJumpListener;

public class ExampleActivity extends Activity implements OnJumpListener {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

    final Button btn = (Button) findViewById(R.id.push);
    btn.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        new JumpDialog(ExampleActivity.this, ExampleActivity.this).only(
            Arrays.asList("J", "U", "M", "P")).inRowsOf(6).show();
      }
    });
  }

  public void onJump(CharSequence c) {
    Toast.makeText(ExampleActivity.this, "selected " + c, Toast.LENGTH_SHORT);
  }
}