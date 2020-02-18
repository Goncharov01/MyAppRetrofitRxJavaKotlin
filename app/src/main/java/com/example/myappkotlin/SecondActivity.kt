package com.example.myappkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myappkotlin.Retrofit.RetrofitClient
import com.example.myappkotlin.Retrofit.TaskModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    private var disposable: Disposable? = null

    private val taskApiService by lazy {
        RetrofitClient.create()
    }

    val tasks: ArrayList<TaskModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        disposable = taskApiService.getTask()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe (
                {
                        result -> println("!!!!!!!!!!!!!!$result")

                }

            )



        val name = intent.getStringExtra("name")
        textName.setText(name)

        val lastName = intent.getStringExtra("lastName")
        textLastName.setText(lastName)


    }
}
