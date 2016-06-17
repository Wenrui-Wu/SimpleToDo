     package com.codepath.simpletodo;

     import android.content.Intent;
     import android.os.Bundle;
     import android.support.v7.app.AppCompatActivity;
     import android.view.View;
     import android.widget.EditText;

     public class EditItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        EditText etEditItem = (EditText) findViewById(R.id.etEditItem);
        if(getIntent().getStringExtra("itemText") != null) {
            etEditItem.setText(getIntent().getStringExtra("itemText"));
        }
        etEditItem.setSelection(etEditItem.getText().length());
    }

     public void onSaveItem (View view) {
         EditText etName = (EditText) findViewById(R.id.etEditItem);
         // Prepare data intent
         Intent data = new Intent();
         // Pass relevant data back as a result
         data.putExtra("newItemText", etName.getText().toString());
         // Activity finished ok, return the data
         setResult(RESULT_OK, data); // set result code and bundle data for response
         finish(); // closes the activity, pass data to parent
     }
}
