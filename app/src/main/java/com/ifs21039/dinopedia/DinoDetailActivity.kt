package com.ifs21039.dinopedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DinoDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dino_detail)

        // Ambil data dari intent
        val dinoPeriod = intent.getStringExtra("dinoPeriod")
        val dinoHabitat = intent.getStringExtra("dinoHabitat")
        val dinoPhysicalCharacteristics = intent.getStringExtra("dinoPhysicalCharacteristics")
        val dinoBehavior = intent.getStringExtra("dinoBehavior")
        val dinoClassification = intent.getStringExtra("dinoClassification")

        // Temukan TextView di layout dan set nilai-nilai yang sudah diambil
        val dinoPeriodTextView: TextView = findViewById(R.id.dinoPeriodTextView)
        val dinoHabitatTextView: TextView = findViewById(R.id.dinoHabitatTextView)
        val dinoPhysicalCharacteristicsTextView: TextView = findViewById(R.id.dinoPhysicalCharacteristicsTextView)
        val dinoBehaviorTextView: TextView = findViewById(R.id.dinoBehaviorTextView)
        val dinoClassificationTextView: TextView = findViewById(R.id.dinoClassificationTextView)

        dinoPeriodTextView.text = "Periode Hidup: $dinoPeriod"
        dinoHabitatTextView.text = "Habitat dan Lingkungan: $dinoHabitat"
        dinoPhysicalCharacteristicsTextView.text = "Karakteristik Fisik: $dinoPhysicalCharacteristics"
        dinoBehaviorTextView.text = "Perilaku: $dinoBehavior"
        dinoClassificationTextView.text = "Klasifikasi: $dinoClassification"
    }

    override fun hasWindowFocus(): Boolean {
        return super.hasWindowFocus()
    }
}