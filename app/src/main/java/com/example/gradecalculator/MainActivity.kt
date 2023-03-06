package com.example.gradecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val participationGrade = findViewById<EditText>(R.id.editText1)
        val homeworkGrade = findViewById<EditText>(R.id.editText2)
        val groupProject = findViewById<EditText>(R.id.editText3)
        val midtermExam1 = findViewById<EditText>(R.id.editText4)
        val midtermExam2 = findViewById<EditText>(R.id.editText5)
        val finalProject = findViewById<EditText>(R.id.editText6)
        val calculateButton = findViewById<Button>(R.id.buttonCalculate)
        val textView = findViewById<TextView>(R.id.result)

    calculateButton.setOnClickListener{
        val participationGrade = participationGrade.text.toString().toInt()
        val homeworkGrade = homeworkGrade.text.toString().toInt()
        val groupProject = groupProject.text.toString().toInt()
        val midtermExam1 = midtermExam1.text.toString().toInt()
        val midtermExam2 = midtermExam2.text.toString().toInt()
        val finalProject = finalProject.text.toString().toInt()
        textView.text = "Final Grade: " + String.format("%.2f",((participationGrade + groupProject + midtermExam1) * 0.1 + (homeworkGrade + midtermExam2)*0.2+ (finalProject)*0.3))
        }
    }
}