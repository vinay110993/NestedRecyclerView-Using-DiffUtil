package com.example.diffutilcallback

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.concurrent.Executors
import kotlin.random.Random

class MainViewModel: ViewModel() {
    val listLiveData = MutableLiveData<List<ParentItem>>()

    init {
        setUpList()
    }

    fun updateList(randomNo: Int){
        Executors.newSingleThreadExecutor().execute{

            val mList = getListData().toMutableList()

            val childItem = mList[randomNo]
            val childList = childItem.list.toMutableList()

            val childId = Random.nextInt(200, 999)
            childList.add(ChildItem(id = childId, name = "new$childId"))

            childItem.list = childList
            mList[randomNo] = childItem

            listLiveData.postValue(mList)
        }
    }

    private fun setUpList(){
        Executors.newSingleThreadExecutor().execute {
            listLiveData.postValue(getListData())
        }
    }

    private fun getListData(): List<ParentItem>{

        val childList1 = mutableListOf(
            ChildItem(id=1, name="ABC_1"), ChildItem(id=2, name="DEF_1"), ChildItem(id=3, name="GHI_1"), ChildItem(id=4, name="JKL_1"), ChildItem(id=5, name="MNO_1"),
            ChildItem(id=6, name="ABC_1"), ChildItem(id=7, name="DEF_1"), ChildItem(id=8, name="GHI_1"), ChildItem(id=9, name="JKL_1"), ChildItem(id=10, name="MNO_1")
        )

        val childList2 = mutableListOf(
            ChildItem(id=1, name="ABC_2"), ChildItem(id=2, name="DEF_2"), ChildItem(id=3, name="GHI_2"), ChildItem(id=4, name="JKL_2"), ChildItem(id=5, name="MNO_2"),
            ChildItem(id=6, name="ABC_2"), ChildItem(id=7, name="DEF_2"), ChildItem(id=8, name="GHI_2"), ChildItem(id=9, name="JKL_2"), ChildItem(id=10, name="MNO_2")
        )

        val childList3 = mutableListOf(
            ChildItem(id=1, name="ABC_3"), ChildItem(id=2, name="DEF_3"), ChildItem(id=3, name="GHI_3"), ChildItem(id=4, name="JKL_3"), ChildItem(id=5, name="MNO_3"),
            ChildItem(id=6, name="ABC_3"), ChildItem(id=7, name="DEF_3"), ChildItem(id=8, name="GHI_3"), ChildItem(id=9, name="JKL_3"), ChildItem(id=10, name="MNO_3")
        )

        val childList4 = mutableListOf(
            ChildItem(id=1, name="ABC_4"), ChildItem(id=2, name="DEF_4"), ChildItem(id=3, name="GHI_4"), ChildItem(id=4, name="JKL_4"), ChildItem(id=5, name="MNO_4"),
            ChildItem(id=6, name="ABC_4"), ChildItem(id=7, name="DEF_4"), ChildItem(id=8, name="GHI_4"), ChildItem(id=9, name="JKL_4"), ChildItem(id=10, name="MNO_4")
        )

        val childList5 = mutableListOf(
            ChildItem(id=1, name="ABC_5"), ChildItem(id=2, name="DEF_5"), ChildItem(id=3, name="GHI_5"), ChildItem(id=4, name="JKL_5"), ChildItem(id=5, name="MNO_5"),
            ChildItem(id=6, name="ABC_5"), ChildItem(id=7, name="DEF_5"), ChildItem(id=8, name="GHI_5"), ChildItem(id=9, name="JKL_5"), ChildItem(id=10, name="MNO_5")
        )

        val childList6 = mutableListOf(
            ChildItem(id=1, name="ABC_6"), ChildItem(id=2, name="DEF_6"), ChildItem(id=3, name="GHI_6"), ChildItem(id=4, name="JKL_6"), ChildItem(id=5, name="MNO_6"),
            ChildItem(id=6, name="ABC_6"), ChildItem(id=7, name="DEF_6"), ChildItem(id=8, name="GHI_6"), ChildItem(id=9, name="JKL_6"), ChildItem(id=10, name="MNO_6")
        )

        val childList7 = mutableListOf(
            ChildItem(id=1, name="ABC_7"), ChildItem(id=2, name="DEF_7"), ChildItem(id=3, name="GHI_7"), ChildItem(id=4, name="JKL_7"), ChildItem(id=5, name="MNO_2"),
            ChildItem(id=6, name="ABC_7"), ChildItem(id=7, name="DEF_7"), ChildItem(id=8, name="GHI_7"), ChildItem(id=9, name="JKL_7"), ChildItem(id=10, name="MNO_2")
        )

        val childList8 = mutableListOf(
            ChildItem(id=1, name="ABC_8"), ChildItem(id=2, name="DEF_8"), ChildItem(id=3, name="GHI_8"), ChildItem(id=4, name="JKL_8"), ChildItem(id=5, name="MNO_8"),
            ChildItem(id=6, name="ABC_8"), ChildItem(id=7, name="DEF_8"), ChildItem(id=8, name="GHI_8"), ChildItem(id=9, name="JKL_8"), ChildItem(id=10, name="MNO_8")
        )

        return listOf(
            ParentItem(id = 101, name = "Suresh", list = childList1),
            ParentItem(id = 102, name = "Ramesh", list = childList2),
            ParentItem(id = 103, name = "Namit", list = childList3),
            ParentItem(id = 104, name = "Nitin", list = childList4),
            ParentItem(id = 105, name = "Ritu", list = childList5),
            ParentItem(id = 106, name = "Anamika", list = childList6),
            ParentItem(id = 107, name = "Harsh", list = childList7),
            ParentItem(id = 108, name = "Sarika", list = childList8)
        )
    }



}