package jonah.santos.com.santosjonahmaepe2;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
import android.widget.EditText;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {
    //String name, age, gender;
    //EditText eName, eAge, eGender;
    //TextView tName, tAge, tGender;
    DBHelper myDatabase;
    EditText editName, editAge, editGender;
    Button btnSave, btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //eName = findViewById(R.id.etFull);
        //eAge = findViewById(R.id.etAge);
        //eGender = findViewById(R.id.etGender);

        myDatabase = new DBHelper(this);

        editName = (EditText)findViewById(R.id.etName);
        editAge = (EditText)findViewById(R.id.etAge);
        editGender = (EditText)findViewById(R.id.etGender);
        btnSave = (Button)findViewById(R.id.bSave);
        btnSearch = (Button)findViewById(R.id.bSearch);
        Save();
    }
    public void Save(){
        btnSave.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        boolean isInserted =  myDatabase.insertData(editName.getText().toString(),
                                editAge.getText().toString(),
                                editGender.getText().toString() );
                        if(isInserted == true)
                            Toast.makeText(MainActivity.this,"Data successfully inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(MainActivity.this,"Data not successfully inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


   // public void save(View v) {
        //name = eName.getText().toString();
        // password = ePwd.getText().toString();
        //SharedPreferences sp = getSharedPreferences("data1", MODE_PRIVATE);
       // SharedPreferences.Editor editor = sp.edit();
        //editor.putString("uname", eName.getText().toString());
       // editor.putString("age", eGender.getText().toString());
       // editor.putString("gender", eGender.getText().toString());
       // editor.commit();
       // Toast.makeText(this, "Data Saved...", Toast.LENGTH_LONG).show();

       // SharedPreferences sp1 =getSharedPreferences("data1",MODE_PRIVATE);
       // String user =sp.getString("uname", null);
       // String age = sp.getString("age", null);
        //String password = sp.getString("gender", null);
        //tName.setText(user);
        //tAge.setText(age);
        //tGender.setText(gender);
    //}

    //public void load (View v){
        //SharedPreferences sp =getSharedPreferences("data1",MODE_PRIVATE);
        //String user =sp.getString("uname", null);
        //String age = sp.getString("age", null);
        //String password = sp.getString("gender", null);
        //tName.setText(user);
        //tAge.setText(age);
       // tGender.setText(gender);

   // }


}
