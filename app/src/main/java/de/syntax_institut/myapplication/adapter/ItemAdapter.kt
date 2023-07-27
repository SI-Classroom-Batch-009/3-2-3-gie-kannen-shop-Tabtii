package de.syntax_institut.myapplication.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import de.syntax_institut.myapplication.data.ItemData
import de.syntax_institut.myapplication.databinding.ListItem2Binding

class ItemAdapter (
    private val context: Context,
    private val dataset: List<ItemData>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    /**
     * der ViewHolder umfasst die View uns stellt einen Listeneintrag dar
     */
    inner class ItemViewHolder(val binding: ListItem2Binding) : RecyclerView.ViewHolder(binding.root)

    /**
     * hier werden neue ViewHolder erstellt
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ListItem2Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    /**
     * hier findet der Recyclingprozess statt
     * die vom ViewHolder bereitgestellten Parameter erhalten die Information des Listeneintrags
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        Log.d("viewholdertest", "view holder binded: $position")

        val item = dataset[position]

        holder.binding.itemTitleTV2.text = context.getString(item.stringResourceTitle)
        holder.binding.itemImageIV2.setImageResource(item.imageResource)
        holder.binding.itemTextTV2.text = context.getString(item.stringResourceText)
    }

    /**
     * damit der LayoutManager weiß, wie lang die Liste ist
     */
    override fun getItemCount(): Int {
        return dataset.size
    }
}