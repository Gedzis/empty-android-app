package gedzis.fwd.application;

import gedzis.fwd.application.model.Straipsnis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {
	private List<Straipsnis> straipsniai;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		straipsniai = sukurtiStraipsniuSarasa();
		setListAdapter(new ArrayAdapter<String>(this,
				R.layout.saraso_elementas, getStraipsniuPavadinimai()));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);

		Intent viewActivityIntent = new Intent(this, ViewActivity.class);
		viewActivityIntent.setData(Uri.parse(straipsniai.get(position)
				.getAdresas()));
		startActivity(viewActivityIntent);
	}

	private List<String> getStraipsniuPavadinimai() {
		List<String> pavadinimai = new ArrayList<String>();
		for (Iterator<Straipsnis> it = straipsniai.iterator(); it.hasNext();) {
			Straipsnis straipsnis = it.next();
			pavadinimai.add(straipsnis.getPavadinimas());
		}
		return pavadinimai;
	}

	private List<Straipsnis> sukurtiStraipsniuSarasa() {
		List<Straipsnis> sarasas = new ArrayList<Straipsnis>();
		sarasas.add(new Straipsnis("Pirmoji Android programa",
				"http://www.fwd.lt/2011/pamokos/pirmoji-android-programa/"));
		sarasas
				.add(new Straipsnis(
						"Android: Activity, Intent, Intent-filter – kas tai ir kam tai reikalinga?",
						"http://www.fwd.lt/2011/pamokos/android-activity-intent-intent-filter-kas-tai-ir-kam-tai-reikalinga/"));
		sarasas.add(new Straipsnis("Android: Mygtukai",
				"http://www.fwd.lt/2011/pamokos/android-mygtukai/"));
		sarasas.add(new Straipsnis("Android Developer Labs 2011",
				"http://www.fwd.lt/2011/smulkme/android-developer-labs-2011/"));
		sarasas
				.add(new Straipsnis(
						"Kaip pagerinti savo programavimo ágûdþius?",
						"http://www.fwd.lt/2011/nuomones/kaip-pagerinti-savo-programavimo-igudzius/"));
		return sarasas;
	}
}