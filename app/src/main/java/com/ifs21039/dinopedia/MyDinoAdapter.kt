package com.ifs21039.dinopedia


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyDinoAdapter(private val myDinoData: Array<MyDinoData>, private val context: Context) :
    RecyclerView.Adapter<MyDinoAdapter.ViewHolder>() {

    private var itemClickListener: OnItemClickListener? = null

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val dinoTitle: TextView = itemView.findViewById(R.id.dinoTitle)
        val dinoDesc: TextView = itemView.findViewById(R.id.dinoDesc)
        val dinoImage: ImageView = itemView.findViewById(R.id.imageview)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(view: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                itemClickListener?.onItemClick(position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.dino_item_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentDino = myDinoData[position]
        holder.dinoTitle.text = currentDino.dinoTitle
        holder.dinoDesc.text = currentDino.dinoDesc
        holder.dinoImage.setImageResource(currentDino.dinoImage)
    }

    override fun getItemCount(): Int {
        return myDinoData.size
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        itemClickListener = listener
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
}


//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val view =
//            LayoutInflater.from(parent.context).inflate(R.layout.dino_item_list, parent, false)
//        return ViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val currentDino = myDinoData[position]
//        holder.dinoTitle.text = currentDino.dinoTitle
//        holder.dinoDesc.text = currentDino.dinoDesc
//        holder.dinoImage.setImageResource(currentDino.dinoImage)
//    }
//
//    override fun getItemCount(): Int {
//        return myDinoData.size
//    }
//
//    fun setOnItemClickListener(listener: OnItemClickListener) {
//        itemClickListener = listener
//    }
//
//    interface OnItemClickListener {
//        fun onItemClick(position: Int)
//    }
//}
