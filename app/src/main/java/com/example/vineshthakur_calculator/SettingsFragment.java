package com.example.vineshthakur_calculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.preference.EditTextPreference;
import android.preference.PreferenceFragment;
import android.preference.SwitchPreference;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Switch;

/**
 * A simple {@link Fragment} subclass.
 */
public class SettingsFragment extends PreferenceFragment {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
        SettingsActivity activity = (SettingsActivity) getActivity();
        SwitchPreference save =  (SwitchPreference) findPreference("savepref");
        activity.setWasDisabled(!save.isChecked());
    }
}