package com.bombadu.esspresoid2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class Listoid : AppCompatActivity() {

    private val list = listOf("Mike", "Steve", "Cate", "Gwen", "Bob", "Mary","Alex", "Ellie")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listoid)

        val listView = findViewById<ListView>(R.id.my_list_view)
        val adapter = ArrayAdapter<String>(this, R.layout.list_item, R.id.list_item_item, list)
        listView.adapter = adapter
        listView.onItemClickListener = AdapterView.OnItemClickListener{ parent, view, position, id ->
            val listText = listView.getItemAtPosition(position)
            Toast.makeText(this, "Text: $listText", Toast.LENGTH_SHORT).show()
            println("TEXT: $listText")


        }

    }
}
