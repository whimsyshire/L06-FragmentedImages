package au.edu.swin.sdmd.l05_fragmentedimages

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/** This is a very quick example of how to create and pass information to
 * Fragments. The Fragment was created by New -> Fragment -> Fragment (Blank)
 * -- this is easier than working from scratch, however an amount of boilerplate
 * is provided for editing.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fm = this.supportFragmentManager

        val station = Location("Glenferrie Station", "Ada May Plante",
            -37.821539f, 145.036473f)

        val vStation = findViewById<TextView>(R.id.station)
        vStation.setOnClickListener {
            val myFragment = DetailFragment.newInstance(station.name, station.author, station.latitude, station.longitude)
            fm.beginTransaction().replace(R.id.fragment, myFragment).commit()

        }

        val vStationActivity = findViewById<TextView>(R.id.station_activity)
        vStationActivity.setOnClickListener {
            val myIntent = Intent(this, DetailActivity::class.java)
            myIntent.putExtra("location", station);
            startActivity(myIntent)
        }
    }


}