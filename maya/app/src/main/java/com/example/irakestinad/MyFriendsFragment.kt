package com.example.irakestinad


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman: ArrayList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman = ArrayList()
        listTeman.add(
            MyFriend(
                "Ira Kestina Damayanti",
                "Perempuan",
                "ikestinadamayanti@gmail.com,",
                "083345678967",
                "Bali"
            )
        )
        listTeman.add(
            MyFriend(
                "Lisa Manoban", "Perempuan", "lalisamanoban@gmail.com",
                "082154321178", "Buriram"
            )
        )
        listTeman.add(
            MyFriend(
                "Jennie Kim", "Perempuan", "jendeuk98@gmail.com",
                "082135679921", "Seoul"
            )
        )
        listTeman.add(
            MyFriend(
                "Jisoo Kim", "Perempuan", "turtlerabbit@gmail.com",
                "0821545326789", "Seoul"
            )
        )
        listTeman.add(
            MyFriend(
                "Chaeyoung Park", "Perempuan", "rosesarerose@gmail.com",
                "082167548890", "Australia"
            )
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private fun tampilTeman() {
        rv_listMyfriends.layoutManager = LinearLayoutManager(activity)
        rv_listMyfriends.adapter = MyFriendAdapter(requireActivity(), listTeman)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()

    }

    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}