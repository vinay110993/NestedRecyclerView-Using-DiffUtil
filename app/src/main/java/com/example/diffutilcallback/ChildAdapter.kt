package com.example.diffutilcallback

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.diffutilcallback.databinding.ChildItemLayoutBinding

class ChildAdapter: RecyclerView.Adapter<ChildAdapter.ViewHolder>() {

    var list = emptyList<ChildItem>()

    fun updateList(newList: List<ChildItem>){
        val diffCallback = ChildDiffCallback(list, newList)
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        diffResult.dispatchUpdatesTo(this)
        this.list = newList
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ChildItemViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.layout_child_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(list.getOrNull(position) ?: return)
    }

    override fun getItemCount() = list.size

    inner class ChildItemViewHolder(private val binding: ChildItemLayoutBinding): ViewHolder(binding.root){

        override fun bindItem(item: ChildItem) {
            binding.tvChildTitle.text= item.name
            binding.executePendingBindings()
        }
    }

    abstract class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        abstract fun bindItem(item: ChildItem)
    }

    class ChildDiffCallback(private val oldList: List<ChildItem>, private val newList: List<ChildItem>) : DiffUtil.Callback() {

        override fun getOldListSize(): Int = oldList.size

        override fun getNewListSize(): Int = newList.size

        override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return oldList[oldItemPosition].id == newList[newItemPosition].id
        }

        override fun areContentsTheSame(oldPosition: Int, newPosition: Int): Boolean {
            val (_, name) = oldList[oldPosition]
            val (_, name1) = newList[newPosition]

            return name == name1
        }
    }


}