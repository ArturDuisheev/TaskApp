package com.example.taskapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.taskapp.databinding.ItemTaskBinding
import com.example.taskapp.model.Task

class TaskAdapter : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    private val data = arrayListOf<Task>()

    fun addTask(task: Task) {
        data.add(0,task)
        notifyItemInserted(0)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val binding = ItemTaskBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return TaskViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class TaskViewHolder(private val binding: ItemTaskBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(task: Task) {
            binding.tvTitle.text = task.title
            binding.tvDesc.text = task.desc
        }
    }
}
