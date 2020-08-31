package anubhav.calculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.pass);
    }

    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.login) {
        if (username.getText().toString().equals("admin") && password.getText().toString().equals("12345")) {

                i = new Intent(this, StandardCal.class);
            Toast.makeText(this,"Login Successfully...",Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        else
        {
            Toast.makeText(this,"Invalid Login...Please try again",Toast.LENGTH_SHORT).show();

        }
        }
    }
//        else if(view.getId()==R.id.button)
//        {
//            i=new Intent(this,ScientificCal.class);
//            startActivity(i);
//        }
//        else if(view.getId()==R.id.button2)
//        {
//            i=new Intent(this,UnitCoverter.class);
//            startActivity(i);
//        }
//    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
