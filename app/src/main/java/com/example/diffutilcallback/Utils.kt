//package com.example.diffutilcallback
//
//object Utils{
//
//    var currentList: List<ParentItem> = emptyList()
//
//    fun setUpList(): List<ParentItem>{
//        val childList1 = mutableListOf(
//            ChildItem(id=1, name="ABC_0"), ChildItem(id=2, name="DEF_0"), ChildItem(id=3, name="GHI_0"), ChildItem(id=4, name="JKL_0"), ChildItem(id=5, name="MNO_0"),
//            ChildItem(id=6, name="ABC_0"), ChildItem(id=7, name="DEF_0"), ChildItem(id=8, name="GHI_0"), ChildItem(id=9, name="JKL_0"), ChildItem(id=10, name="MNO_0")
//        )
//
//        val childList2 = mutableListOf(
//            ChildItem(id=1, name="ABC_1"), ChildItem(id=2, name="DEF_1"), ChildItem(id=3, name="GHI_1"), ChildItem(id=4, name="JKL_1"), ChildItem(id=5, name="MNO_1"),
//            ChildItem(id=6, name="ABC_1"), ChildItem(id=7, name="DEF_1"), ChildItem(id=8, name="GHI_1"), ChildItem(id=9, name="JKL_1"), ChildItem(id=10, name="MNO_1")
//        )
//
//        val childList3 = mutableListOf(
//            ChildItem(id=1, name="ABC_2"), ChildItem(id=2, name="DEF_2"), ChildItem(id=3, name="GHI_2"), ChildItem(id=4, name="JKL_2"), ChildItem(id=5, name="MNO_2"),
//            ChildItem(id=6, name="ABC_2"), ChildItem(id=7, name="DEF_2"), ChildItem(id=8, name="GHI_2"), ChildItem(id=9, name="JKL_2"), ChildItem(id=10, name="MNO_2")
//        )
//
//        val childList4 = mutableListOf(
//            ChildItem(id=1, name="ABC_3"), ChildItem(id=2, name="DEF_3"), ChildItem(id=3, name="GHI_3"), ChildItem(id=4, name="JKL_3"), ChildItem(id=5, name="MNO_3"),
//            ChildItem(id=6, name="ABC_3"), ChildItem(id=7, name="DEF_3"), ChildItem(id=8, name="GHI_3"), ChildItem(id=9, name="JKL_3"), ChildItem(id=10, name="MNO_3")
//        )
//
//        val childList5 = mutableListOf(
//            ChildItem(id=1, name="ABC_4"), ChildItem(id=2, name="DEF_4"), ChildItem(id=3, name="GHI_4"), ChildItem(id=4, name="JKL_4"), ChildItem(id=5, name="MNO_4"),
//            ChildItem(id=6, name="ABC_4"), ChildItem(id=7, name="DEF_4"), ChildItem(id=8, name="GHI_4"), ChildItem(id=9, name="JKL_4"), ChildItem(id=10, name="MNO_4")
//        )
//
//        val childList6 = mutableListOf(
//            ChildItem(id=1, name="ABC_5"), ChildItem(id=2, name="DEF_5"), ChildItem(id=3, name="GHI_5"), ChildItem(id=4, name="JKL_5"), ChildItem(id=5, name="MNO_5"),
//            ChildItem(id=6, name="ABC_5"), ChildItem(id=7, name="DEF_5"), ChildItem(id=8, name="GHI_5"), ChildItem(id=9, name="JKL_5"), ChildItem(id=10, name="MNO_5")
//        )
//
//        val childList7 = mutableListOf(
//            ChildItem(id=1, name="ABC_6"), ChildItem(id=2, name="DEF_6"), ChildItem(id=3, name="GHI_6"), ChildItem(id=4, name="JKL_6"), ChildItem(id=5, name="MNO_6"),
//            ChildItem(id=6, name="ABC_6"), ChildItem(id=7, name="DEF_6"), ChildItem(id=8, name="GHI_6"), ChildItem(id=9, name="JKL_6"), ChildItem(id=10, name="MNO_6")
//        )
//
//        val childList8 = mutableListOf(
//            ChildItem(id=1, name="ABC_7"), ChildItem(id=2, name="DEF_7"), ChildItem(id=3, name="GHI_7"), ChildItem(id=4, name="JKL_7"), ChildItem(id=5, name="MNO_7"),
//            ChildItem(id=6, name="ABC_7"), ChildItem(id=7, name="DEF_7"), ChildItem(id=8, name="GHI_7"), ChildItem(id=9, name="JKL_7"), ChildItem(id=10, name="MNO_7")
//        )
//
//        return listOf(
//            ParentItem(id = 101, name = "Suresh", list = childList1),
//            ParentItem(id = 102, name = "Ramesh", list = childList2),
//            ParentItem(id = 103, name = "Namit", list = childList3),
//            ParentItem(id = 104, name = "Nitin", list = childList4),
//            ParentItem(id = 105, name = "Ritu", list = childList5),
//            ParentItem(id = 106, name = "Anamika", list = childList6),
//            ParentItem(id = 107, name = "Harsh", list = childList7),
//            ParentItem(id = 108, name = "Sarika", list = childList8)
//        )
//
//    }
//}