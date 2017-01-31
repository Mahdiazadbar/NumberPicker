package ir.mahdiazadbar.samplenumberpicker;

import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ir.mahdiazadbar.numberpicker.NumberPicker;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumberPicker numberPicker = (NumberPicker) findViewById(R.id.number_picker);


        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(4);
        numberPicker.setDisplayedValues(new String[]{"Disable", "1 Minute", "5 Minute", "1 Hour", "5 Hour"});

        numberPicker = (NumberPicker) findViewById(R.id.number_picker);

        Typeface typeface = Typeface.createFromAsset(getAssets(),
                getString(R.string.font_path));
        numberPicker.setTypeface(typeface);
    }
}
