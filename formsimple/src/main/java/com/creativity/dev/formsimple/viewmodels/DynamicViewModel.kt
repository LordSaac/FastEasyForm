package com.creativity.dev.formsimple.viewmodels

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.creativity.dev.formsimple.FireLinkList
import com.creativity.dev.formsimple.model.ListDynamic


class DynamicViewModel:ViewModel(){
    private lateinit var list: MutableLiveData<List<ListDynamic>>

    init { list.value = FireLinkList.list }

    fun getData(): LiveData<List<ListDynamic>> {
        if (!::list.isInitialized) {
            list = MutableLiveData()
            loadUsers()
        }
        return list
    }

    private fun loadUsers() {
    }

}