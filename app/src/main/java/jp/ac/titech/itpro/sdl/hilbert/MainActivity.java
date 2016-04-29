package jp.ac.titech.itpro.sdl.hilbert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView levelView;
    private HilbertView hilbertView;
    private final static int MAX_N = 9;
    private int n = 1;
    private final static String KEY_N = "MainActivity.n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        levelView = (TextView)findViewById(R.id.level_view);
        hilbertView = (HilbertView)findViewById(R.id.hilbert_view);
        if (savedInstanceState != null)
            n = savedInstanceState.getInt(KEY_N);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_N, n);
    }

    @Override
    protected void onResume() {
        super.onResume();
        display();
    }

    public void onClickDec(View v) {
        if (n > 1) n--;
        display();
    }

    public void onClickInc(View v) {
        if (n < MAX_N) n++;
        display();

    }

    private void display() {
        levelView.setText(getString(R.string.level_format, n));
        hilbertView.setLevel(n);
    }
}
