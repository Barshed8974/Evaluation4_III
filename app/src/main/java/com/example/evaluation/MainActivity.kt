package com.example.evaluation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var  responseDTO: ResponseDTO
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener(View.OnClickListener {
            callApi()
        })
    }

    private fun callApi() {
        var clientApi=Network.getRetrofit().create(ClientApi::class.java)
        clientApi.getApi(search.text.toString()).enqueue(object : Callback<ResponseDTO>
        {
            override fun onResponse(call: Call<ResponseDTO>, response: Response<ResponseDTO>) {
                responseDTO=response.body()!!
                setRecycleView()
            }

            override fun onFailure(call: Call<ResponseDTO>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }

    private fun setRecycleView() {
        var  myAdapter=MyAdapter(responseDTO.results as List<ResultsDTO>)
        var linearLayoutManager=LinearLayoutManager(this)
        recycler.adapter=myAdapter
        recycler.layoutManager=linearLayoutManager
    }
}
