package com.example.bledemoapp;

import android.bluetooth.BluetoothDevice;

import androidx.lifecycle.ViewModel;

public class GattServerViewModel extends ViewModel {
    private BluetoothDevice mBluetoothDevice;


    public GattServerViewModel(BluetoothDevice bluetoothDevice) {
        mBluetoothDevice = bluetoothDevice;
    }


    public String getServerName() {
        if (mBluetoothDevice == null) {
            return "";
        }
        return mBluetoothDevice.getAddress();
    }
}
