package com.example.finalproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.*
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.finalproject.databinding.ContactsFragmentBinding
import com.google.android.material.snackbar.Snackbar


class ContactsFragment : Fragment() {
    private var _binding: ContactsFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ContactsFragmentBinding.inflate(inflater, container, false)
        val rootView = binding.root

        binding.mail.setOnClickListener {
            composeEmail(
                "dyskaf@ahsd.org",
                "Question to Abington Heights Soccer",
                " "
            )
        }
        binding.phone.setOnClickListener {
            dialPhoneNumber("5706876571")
        }
        binding.facebook.setOnClickListener {
            openWebPage("https://www.facebook.com/friendsofahsoccer/")
        }
        binding.insta.setOnClickListener {
            openWebPage("https://www.instagram.com/ahboysoc/")
        }
        setHasOptionsMenu(true)
        binding.camera.setOnClickListener {
            openWebPage("https://www.byronmaldonadophotography.com/Sports/Abington-Heights-Soccer")
        }
        //val snackbar = Snackbar.make(binding.root, "You can ", Snackbar.LENGTH_SHORT).show()



        return rootView

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController()) || super.onContextItemSelected(item)
    }

    fun composeEmail(addresses: String, subject: String, body: String) {
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "*/*"
            putExtra(Intent.EXTRA_EMAIL, addresses)
            putExtra(Intent.EXTRA_SUBJECT, subject)
            putExtra(Intent.EXTRA_STREAM, body)
        }
            startActivity(intent)
        }

    fun dialPhoneNumber(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel:$phoneNumber")
        }
            startActivity(intent)

    }
    fun showMap(geoLocation: Uri) {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = geoLocation
        }
            startActivity(intent)

    }
    fun openWebPage(url: String) {
        val webpage: Uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webpage)
            startActivity(intent)
        }



    }






