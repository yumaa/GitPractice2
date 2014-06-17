package com.example.sample;

import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onButtonClick(View v) {
		TextView tv = (TextView) findViewById(R.id.textview1);
		tv.setText("sample");
	}

	public void onButtonClick2(View v) {

		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH) + 1;
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minite = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		StringBuffer dow = new StringBuffer();
		switch(cal.get(Calendar.DAY_OF_WEEK)){
			case Calendar.SUNDAY: dow.append("ì˙"); break;
			case Calendar.MONDAY: dow.append("åé"); break;
			case Calendar.TUESDAY: dow.append("âŒ"); break;
			case Calendar.WEDNESDAY: dow.append("êÖ"); break;
			case Calendar.THURSDAY: dow.append("ñÿ"); break;
			case Calendar.FRIDAY: dow.append("ã‡"); break;
			case Calendar.SATURDAY: dow.append("ìy"); break;
		}
		builder.setTitle("Now!").setMessage(year +"îN"+ month + "åé" + day + "ì˙(" + dow + ")" + hour + "éû" + minite + "ï™" + second + "ïb")
				.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub

					}
				}).setCancelable(false).show();
	}

}
