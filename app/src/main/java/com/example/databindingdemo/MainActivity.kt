package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

//class Student extends Person
class MainActivity : AppCompatActivity() {
    //int i
    //var i:int //declare the variable should assign
    //later initialiaze
    private lateinit var binding: ActivityMainBinding

    private lateinit var student : Student

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
       // binding.myData = student

        //Student student = new Student()
        //var student :Student = Student("Ali",20, "RSD")  //Force to parse in

        binding.btnSetValue.setOnClickListener(){
            student = Student("Ali",20, "RSD")
            binding.myData = student
        }

        //todo::display student info
        binding.btnDisplay.setOnClickListener(){
            student.programme = "RIS"

            binding.apply{
                invalidateAll()
            }
//            binding.tvName.text = student.name //binding.editName.setText(student.name)
//            binding.tvAge.text = student.age.toString()
//            binding.tvProgramme.text = student.programme
        }

    }
}