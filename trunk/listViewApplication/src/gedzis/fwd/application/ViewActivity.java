package gedzis.fwd.application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class ViewActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_activity_gui);

		//Paimame duomenis
		Intent launchingIntent = getIntent();
		String content = launchingIntent.getData().toString();

		WebView viewer = (WebView) findViewById(R.id.webView);
		viewer.loadUrl(content);
	}
}
