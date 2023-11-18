package com.example.y3dop

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Asignar acciones a los botones
        loadFilesButton.setOnClickListener {
        // Agregar la lógica para cargar archivos aquí
            val intent = Intent(Intent.ACTION_OPEN_DOCUMENT)
            intent.addCategory(Intent.CATEGORY_OPENABLE)
            intent.setType("file/*")
            startActivityForResult(intent, 1)
        }

        bluetoothButton.setOnClickListener {
            // Verificar si el Bluetooth está habilitado
            val bluetoothAdapter = BluetoothAdapter.getDefaultAdapter()
            if (bluetoothAdapter == null) {
            // El dispositivo no admite Bluetooth
            } else {
                if (!bluetoothAdapter.isEnabled) {
                    // El Bluetooth está deshabilitado, abrir la pantalla de configuración de Bluetooth
                    val enableBtIntent = Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
                    startActivityForResult(enableBtIntent, 1)
                } else {
                // Agregar la lógica de conexión Bluetooth aquí
                }
            }
        }


        playButton.setOnClickListener {
        // Agregar la lógica para reproducir aquí
        }

        stopButton.setOnClickListener {
        // Agregar la lógica para detener aquí
        }

        settingsButton.setOnClickListener {
        // Agregar la lógica para configuración aquí
        }
    }

    // Override onActivityResult to handle the selected file
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK) {
            val uri = data?.data
            // Do something with the URI
        }
    }

}