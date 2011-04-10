# Jumper

Simple hopity jump `Dialog` for selecting alphanumeric indexed options for you android pleasure

## usage

    import com.happytap.JumpDialog

    new JumpDialog(context, new JumpDialog.OnJumpListener() {
      public void onJump(CharSequence c) {
        Toast.makeText("Hop to " + c, Toast.LENGTH_LONG);
      }
    }).only(
      Arrays.asList("J", "U", "M", "P")
    ).show();

happytap 2011
