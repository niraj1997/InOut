


package hackathon.example.paisa;

import hackathon.example.paisa.R;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.support.v7.app.ActionBarActivity;

import android.view.Menu;


import android.view.MenuItem;


public class Profile extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_home);
        Button paisa = (Button) findViewById(R.id.paisa);
        paisa.setOnClickListener(new View.OnClickListener() {
        	 
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(Profile.this,Paisa.class);
                
    

            startActivity(nextScreen);
        }
        });   
        Button settings = (Button) findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
        	 
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(Profile.this,Settings.class);
                
    

            startActivity(nextScreen);
        }
        });   
        Button messages = (Button) findViewById(R.id.messages);
        messages.setOnClickListener(new View.OnClickListener() {
        	 
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(Profile.this, Messages.class);
                
    

            startActivity(nextScreen);
        }
        });   
        
        
        
}
        
    
        
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }
    
   
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
