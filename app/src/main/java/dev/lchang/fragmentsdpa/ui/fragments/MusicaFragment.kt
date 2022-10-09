package dev.lchang.fragmentsdpa.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.lchang.fragmentsdpa.R
import dev.lchang.fragmentsdpa.ui.adapter.SongAdapter
import dev.lchang.fragmentsdpa.ui.models.Song

class MusicaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View =  inflater.inflate(R.layout.fragment_musica, container, false)
        val rvMusica: RecyclerView = view.findViewById(R.id.rvMusica)
        rvMusica.layoutManager = LinearLayoutManager(requireContext())
        rvMusica.adapter = SongAdapter(listSongLinkinPark())
        return view
    }

    private fun listSongLinkinPark(): List<Song>{
        var lstSong: ArrayList<Song> = ArrayList()

        lstSong.add(Song(1,R.drawable.intheend,"In the end","Hybrid Theory","20,000","3:36"))
        lstSong.add(Song(2,R.drawable.numb,"Numb","Hybrid Theory","18,000","4:16"))
        lstSong.add(Song(3,R.drawable.whativedone,"What I've done","Hybrid Theory","16,000","5:56"))
        lstSong.add(Song(4,R.drawable.onestepcloser,"One step closer","Hybrid Theory","14,000","2:06"))
        lstSong.add(Song(5,R.drawable.castleofglass,"Castle of Glass","Hybrid Theory","12,000","3:46"))
        return lstSong

    }

}