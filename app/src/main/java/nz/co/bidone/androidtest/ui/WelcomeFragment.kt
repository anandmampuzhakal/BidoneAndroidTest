package nz.co.bidone.androidtest.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import nz.co.bidone.androidtest.R

/**
 * @author Anand M Joseph (anandmampuzhakal@hotmail.com)
 */
class WelcomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)
        view.findViewById<Button>(R.id.button_list_of_orders_start).setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_list_of_orders)
        }
        return view
    }
}