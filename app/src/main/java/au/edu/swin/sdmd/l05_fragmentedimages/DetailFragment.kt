package au.edu.swin.sdmd.l05_fragmentedimages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_NAME = "name"
private const val ARG_AUTHOR = "author"
private const val ARG_LATITUDE = "latitude"
private const val ARG_LONGITUDE = "longitude"

/**
 * A simple [Fragment] subclass.
 * Use the [DetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var name: String? = null
    private var author: String? = null
    private var latitude: String? = null
    private var longitude: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println(savedInstanceState)
        arguments?.let {
            name = it.getString(ARG_NAME)
            author = it.getString(ARG_AUTHOR)
            latitude = it.getString(ARG_LATITUDE)
            longitude = it.getString(ARG_LONGITUDE)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        // This is where the views should be set using the values passed
        // when the fragment was created.

        val view = inflater.inflate(R.layout.fragment_detail, container, false)
        val name = view.findViewById<TextView>(R.id.name)
        name.text = this.name
        val author = view.findViewById<TextView>(R.id.author)
        author.text = this.author
        val latitude = view.findViewById<TextView>(R.id.latitude)
        latitude.text = this.latitude
        val longitude = view.findViewById<TextView>(R.id.longitude)
        longitude.text = this.longitude
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DetailFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String, param3: Float, param4: Float) =
            DetailFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_NAME, name)
                    putString(ARG_AUTHOR, author)
                    putString(ARG_LATITUDE, latitude)
                    putString(ARG_LONGITUDE, longitude)
                }
            }
    }
}