package com.example.finalproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.finalproject.databinding.ContactsFragmentBinding

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
            composeEmail("patelj23@hsnet.ahsd.org", "Question to Abington Heights", "What time school start?")
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






