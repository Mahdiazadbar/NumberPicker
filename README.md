# Android Number Picker
A Costum Android Number Picker 

## How Use
import library

![Sample](https://github.com/Mahdiazadbar/NumberPicker/blob/master/Screenshot_1485857638.png)


### Example:

```java
        NumberPicker numberPicker = (NumberPicker) findViewById(R.id.number_picker);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(4);
        numberPicker.setDisplayedValues(new String[]{"Disable", "1 Minute", "5 Minute", "1 Hour", "5 Hour"});
        numberPicker = (NumberPicker) findViewById(R.id.number_picker);
        Typeface typeface = Typeface.createFromAsset(getAssets(),
                getString(R.string.font_path));
        numberPicker.setTypeface(typeface);
```

```xml
        <ir.mahdiazadbar.numberpicker.NumberPicker
        android:id="@+id/number_picker"
        android:layout_width="match_parent"
        android:layout_height="100dp"
        android:layout_centerInParent="true"
        app:np_dividerColor="#248d76"
        app:np_textColor="#3fb98c"
        app:np_textSize="16sp"
        app:np_typeface="@string/font_path" />
```
