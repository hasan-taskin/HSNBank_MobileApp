package com.example.hsnbankmobileappproject

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Kenardan kenara görünüm sağla
        WindowCompat.setDecorFitsSystemWindows(window, false)

        // Temayı uygula
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        val transactions = listOf(
            "08.05.2025 - Alışveriş -985₺",
            "07.05.2025 - Kafe -100₺",
            "06.05.2025 - Market -420₺",
            "05.05.2025 - Maaş +60.000₺",
            "04.05.2025 - Sinema -260₺",
            "03.05.2025 - Yemek -245₺",
            "02.05.2025 - Kira -15.000₺",
            "01.05.2025 - Fatura -1250₺"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, transactions)
        listView.adapter = adapter
    }
}


