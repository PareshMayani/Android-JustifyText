package com.technotalkative.justifytext;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		String htmlText = "<html><body style=\"text-align:justify\"> %s </body></Html>";
		String myData = "Hello World! This tutorial is to show demo of displaying text with justify alignment in WebView.";
		
		WebView webView = (WebView) findViewById(R.id.webView1);
		webView.loadData(String.format(htmlText, myData), "text/html", "utf-8");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
