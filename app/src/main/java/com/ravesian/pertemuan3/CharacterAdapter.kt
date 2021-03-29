package com.ravesian.pertemuan3

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.ravesian.pertemuan3.databinding.ItemJurusanBinding

class CharacterAdapter(private val list: MutableList<Character>, private val context: Context):
    RecyclerView.Adapter<CharacterAdapter.ViewHolder>() {

    class ViewHolder(private val binding: ItemJurusanBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(character: Character){
            with(binding){
                civProfile.load(character.image)
                tvName.text = character.name
                tvAge.text = character.age.toString()
            }
        }
    }

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemJurusanBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(list[holder.adapterPosition], context) }
    }

    override fun getItemCount(): Int = list.size

    interface OnItemClickCallback {
        fun onItemClicked(data: Character, context: Context)
    }
}