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
            MyFriend("Ira Kestina", "perempuan", "irakestina@gmail.com", "082134567891", "Bali")
        )
        listTeman.add(
            MyFriend("Lalisa Manoban", "perempuan", "llalalisa@gmail.com", "0872134889654", "Kediri")
        )
        listTeman.add(
            MyFriend("Jennie Kim", "perempuan", "jendeukie90@gmail.com", "085677324578", "Bondowoso")
        )
        listTeman.add(
            MyFriend("Jisoo Kim", "perempuan", "turtlerabbit@gmail.com", "085674321447", "Bandung")
        )
        listTeman.add(
            MyFriend("Chaeyoung Park", "perempuan", "mawarmelati@gmail.com", "087734567829", "Solo")
        )
        listTeman.add(
            MyFriend("Billie Ellish", "perempuan", "bilbellish@gmail.com", "0875678439088", "Nganjuk")
        )
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