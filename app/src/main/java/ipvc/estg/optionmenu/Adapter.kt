package ipvc.estg.optionmenu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class Adapter(private val imgList: ArrayList<dataimg>) :
RecyclerView.Adapter<Adapter.MyViewHolder>(){
    class MyViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        val imageId: ShapeableImageView =itemView.findViewById(R.id.imageView)
        val nameText: TextView = itemView.findViewById(R.id.textView)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = imgList[position]
        holder.imageId.setImageResource(currentItem.img)
        holder.nameText.text = currentItem.name
    }


    override fun getItemCount(): Int {
        return imgList.size
    }
}