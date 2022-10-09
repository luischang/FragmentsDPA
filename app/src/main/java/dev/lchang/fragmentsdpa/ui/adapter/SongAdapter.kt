package dev.lchang.fragmentsdpa.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.lchang.fragmentsdpa.R
import dev.lchang.fragmentsdpa.ui.models.Song

class SongAdapter(private var lstSong: List<Song>)
    : RecyclerView.Adapter<SongAdapter.ViewHolder>()  {
        class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
            val ivSong: ImageView = itemView.findViewById(R.id.ivSong)
            val tvAlbum: TextView = itemView.findViewById(R.id.tvAlbum)
            val tvSong: TextView = itemView.findViewById(R.id.tvSong)
            val tvCountViews: TextView = itemView.findViewById(R.id.tvCountiews)
            val tvSongTime: TextView = itemView.findViewById(R.id.tvSongTime)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_musica, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemSong = lstSong[position]
        holder.tvAlbum.text = itemSong.album
        holder.tvSong.text = itemSong.songName
        holder.tvCountViews.text = itemSong.countViews
        holder.tvSongTime.text = itemSong.songTime
        holder.ivSong.setImageResource(itemSong.image)
    }

    override fun getItemCount(): Int {
        return lstSong.size
    }


}