package com.example.finalproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.finalproject.databinding.ContactsFragmentBinding

class ContactsFragment : AppCompatActivity() {
    lateinit var binding: ContactsFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ContactsFragmentBinding.inflate(layoutInflater)
        val rootView = binding.root
        setContentView(rootView)

        binding.mail.setOnClickListener {
            composeEmail("patelj23@hsnet.ahsd.org", "Question to Abington Heights", "What time school start?")
        }
        binding.phone.setOnClickListener {
            dialPhoneNumber("5706876571")
        }
     //   binding.visit.setOnClickListener {
      //      showMap("geo:41.49358534621268, -75.72353415948145")
       // }
        binding.facebook.setOnClickListener {
            openWebPage("https://www.facebook.com/friendsofahsoccer/")
        }
        binding.insta.setOnClickListener {
            openWebPage("https://www.instagram.com/ahboysoc/")
        }
    }

    fun composeEmail(addresses: String, subject: String, body: String) {
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "*/*"
            putExtra(Intent.EXTRA_EMAIL, addresses)
            putExtra(Intent.EXTRA_SUBJECT, subject)
            putExtra(Intent.EXTRA_STREAM, body)
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
    fun dialPhoneNumber(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel:$phoneNumber")
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
    fun showMap(geoLocation: Uri) {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = geoLocation
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
    fun openWebPage(url: String) {
        val webpage: Uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webpage)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
}

