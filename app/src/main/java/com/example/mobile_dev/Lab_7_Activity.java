package com.example.mobile_dev;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lab_7_Activity extends AppCompatActivity {

    private final static String FILE_NAME = "content.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab_7);
    }

    public void buttonSaveClick(View view)
    {
        try
        {
            EditText textBox = (EditText) findViewById(R.id.editTextTextPersonName);
            String text = textBox.getText().toString();
            FileOutputStream fos = null;
            fos = openFileOutput(FILE_NAME, MODE_PRIVATE);
            fos.write(text.getBytes());
            fos.close();
            textBox.setText(null);
            Toast.makeText(this, "Текстовый файл успешно сохранён!", Toast.LENGTH_SHORT).show();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
            Toast.makeText(this, "Файл не найден!", Toast.LENGTH_SHORT).show();
        } catch (IOException e)
        {
            e.printStackTrace();
            Toast.makeText(this, "Ошибка сохранения файла!", Toast.LENGTH_SHORT).show();
        }
    }

    public void buttonOpenClick(View view)
    {
        try
        {
            FileInputStream fin = null;
            fin = openFileInput(FILE_NAME);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String(bytes);
            EditText textBox = (EditText) findViewById(R.id.editTextTextPersonName);
            textBox.setText(text);
            fin.close();
        } catch (IOException ex)
        {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}