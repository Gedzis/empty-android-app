package gedzis.fwd.application;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ImageButton manoMygtukasSuPaveiksleliu = (ImageButton) findViewById(R.id.mygtukas_su_paveiksleliu);
		manoMygtukasSuPaveiksleliu.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		                    Toast.makeText(MainActivity.this, "Mygtukas su paveiksleliu paspaustas!", Toast.LENGTH_SHORT).show();
		            }
		});
	}

	public void mygtukoVeiksmas(View view) {
		Toast.makeText(this, "Mygtukas paspaustas!", Toast.LENGTH_SHORT).show();
	}
}