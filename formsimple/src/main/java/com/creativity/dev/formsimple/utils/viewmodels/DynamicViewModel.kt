package com.creativity.dev.formsimple.utils.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.creativity.dev.formsimple.BuilderForms
import com.creativity.dev.formsimple.model.ListDynamic


class DynamicViewModel: ViewModel(){

    private lateinit var list: MutableLiveData<List<ListDynamic>>

    init { list.value = BuilderForms.list }

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