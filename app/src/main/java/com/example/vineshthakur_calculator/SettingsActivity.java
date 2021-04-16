package com.example.vineshthakur_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.SwitchPreference;
import android.view.MenuItem;
import android.widget.EditText;

public class SettingsActivity extends AppCompatActivity {

    private Boolean wasDisabled;
    SettingsFragment settings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        settings = new SettingsFragment();
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, settings)
                .commit();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem i) {
        switch (i.getItemId()) {
            case android.R.id.home:
                SwitchPreference save = (SwitchPreference) settings.findPreference("savepref");
                if (wasDisabled && save.isEnabled()) {
                    EditTextPreference result = (EditTextPreference) settings.findPreference("result");
                    result.setText(getIntent().getStringExtra("result"));
                    return super.onOptionsItemSelected(i);
                }
            default:
                return super.onOptionsItemSelected(i);
        }
    }

    public void setWasDisabled(Boolean wasDisabled) {
        this.wasDisabled = wasDisabled;
    }
}