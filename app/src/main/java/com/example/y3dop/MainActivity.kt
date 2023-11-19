package com.example.y3dop

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Asignar acciones a los botones
        val loadFilesButton: Button = findViewById(R.id.loadFilesButton)
        loadFilesButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_OPEN_DOCUMENT)
            intent.addCategory(Intent.CATEGORY_OPENABLE)
            intent.setType("file/*")
            startActivityForResult(intent, 1)
        }

        val bluetoothButton: Button = findViewById(R.id.bluetoothButton)
        bluetoothButton.setOnClickListener {
            val bluetoothIntent = Intent(this, BluetoothActivity::class.java)
            startActivity(bluetoothIntent)
        }

        val playButton: Button = findViewById(R.id.playButton)
        playButton.setOnClickListener {
        // Agregar la lógica para reproducir aquí
        }

        val stopButton: Button = findViewById(R.id.stopButton)
        stopButton.setOnClickListener {
        // Agregar la lógica para detener aquí
        }

        val settingsButton : Button = findViewById(R.id.settingsButton )
        settingsButton .setOnClickListener {
        // Agregar la lógica para configuración aquí
        }

    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK) {
            val uri = data?.data
            // Do something with the URI
        }
    }
}