package com.example.diffutilcallback

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.diffutilcallback.databinding.ParentItemLayoutBinding

class ParentAdapter: RecyclerView.Adapter<ParentAdapter.ViewHolder>() {

    private val list = mutableListOf<ParentItem>()

    fun updateList(newList: List<ParentItem>) {
        val diffCallback = ParentDiffCallback(oldList = this.list.toList(), newList= newList)
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        this.list.clear()
        this.list.addAll(newList)
        diffResult.dispatchUpdatesTo(this)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ParentItemViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.layout_parent_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(list.getOrNull(position) ?: return)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int, payload: MutableList<Any>) {
        if(payload.isNullOrEmpty())  super.onBindViewHolder(holder, position, payload)
        else {
            val list = payload.getOrNull(0) as? List<ChildItem> ?: return
            holder.payloadList(list)
        }
    }

    override fun getItemCount() = list.size

    inner class ParentItemViewHolder(private val binding: ParentItemLayoutBinding): ViewHolder(binding.root){
        var adapter: ChildAdapter ?= null
        init{
            adapter = ChildAdapter()
            binding.rcvChild.adapter = adapter
            binding.rcvChild.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
        }

        override fun bindItem(item: ParentItem) {
            adapter?.updateList(item.list)

            binding.tvTitle.text= item.name

            binding.executePendingBindings()
        }

        override fun payloadList(list: List<ChildItem>) {
            adapter?.updateList(list)
        }
    }

    abstract class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        abstract fun bindItem(item: ParentItem)
        abstract fun payloadList(list: List<ChildItem>)
    }

    class ParentDiffCallback(private val oldList: List<ParentItem>, private val newList: List<ParentItem>) : DiffUtil.Callback() {
        override fun getOldListSize(): Int = oldList.size
        override fun getNewListSize(): Int = newList.size

        override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            val value = oldList[oldItemPosition].id == newList[newItemPosition].id
            return value
        }

        override fun areContentsTheSame(oldPosition: Int, newPosition: Int): Boolean {
            val (_, name, list) = oldList[oldPosition]
            val (_, name1, list1) = newList[newPosition]
            return name == name1 && list == list1
        }

        override fun getChangePayload(oldItemPosition: Int, newItemPosition: Int): Any? {
            val value = oldList[oldItemPosition].list == newList[newItemPosition].list
            return if(!value) newList[newItemPosition].list else null
        }
    }

}