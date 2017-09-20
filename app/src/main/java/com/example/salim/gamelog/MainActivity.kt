package com.example.salim.gamelog

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myToolbar = findViewById<View>(R.id.my_toolbar) as Toolbar
        setSupportActionBar(myToolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_add -> {
                // User chose the "Settings" item, show the app settings UI...
                var intent = Intent(this, AddGameActivity::class.java)
                val message = "This is good"
                intent.putExtra(EXTRA_MESSAGE, message)
                startActivity(intent)
                return true
            }

            R.id.action_search ->
                // User chose the "Settings" item, show the app settings UI...
                return true

            else ->
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item)
        }
    }
}
