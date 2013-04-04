package nl.smp.util;

import android.widget.ArrayAdapter;
import android.widget.Spinner;

public final class SpinnerSelection {
	public static void selectByValue(Spinner spinner, String value) {
		ArrayAdapter<String> adapter = (ArrayAdapter<String>)spinner.getAdapter();
		for (int i = 0; i < adapter.getCount(); i++) {
			if (((String)adapter.getItem(i)).equalsIgnoreCase(value)) {
				spinner.setSelection(i);
				break;
			}
		}
	}
}