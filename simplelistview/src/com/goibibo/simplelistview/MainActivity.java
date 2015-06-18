package com.goibibo.simplelistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity {
	private ArrayAdapter<String> mlistdata;
	private EditText metinput;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button button1=(Button) findViewById(R.id.button1);
	metinput=(EditText) findViewById(R.id.editText1);
		ListView lvlist=(ListView) findViewById(R.id.listView1); 
		
		
		mlistdata=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
		
		lvlist.setAdapter(mlistdata);
		
		
		button1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				onadditemtolistclicked();
			}
				
			});
	}

			private void onadditemtolistclicked() {
				// TODO Auto-generated method stub
				String value;
				value=this.metinput.getText().toString();
			
				this.mlistdata.add(value);
				mlistdata.notifyDataSetChanged();
				
			}

		
		
		
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
