package com.example.y3dop

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.y3dop.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Asignar acciones a los botones
        loadFilesButton.setOnClickListener {
        // Agregar la lógica para cargar archivos aquí
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
}