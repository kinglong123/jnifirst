package gebilaolitou.ndkdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String text = NDKTools.getStringFromNDK();
        Log.i("gebilaolitou","text="+text);
        ((TextView)findViewById(R.id.tv)).setText(text);
    }
}
