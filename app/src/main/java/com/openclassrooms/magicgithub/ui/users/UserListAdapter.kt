package com.openclassrooms.magicgithub.ui.users

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.RecyclerView
import com.openclassrooms.magicgithub.R
import com.openclassrooms.magicgithub.data.model.User
import com.openclassrooms.magicgithub.ui.utils.UserDiffCallback

class UserListAdapter(
    private val callback: Listener
) : RecyclerView.Adapter<ListUserViewHolder>() {

    // Permet de gérer la mise à jour de la liste de données
    private val mDiffer: AsyncListDiffer<User> =
        AsyncListDiffer(this, UserDiffCallback())

    interface Listener {
        fun onClickDelete(user: User)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListUserViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_list_user, parent, false)
        return ListUserViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListUserViewHolder, position: Int) {
        holder.bind(mDiffer.currentList[position], callback)
    }

    override fun getItemCount(): Int {
        return mDiffer.currentList.size
    }

    // PUBLIC API ---
    fun updateList(newList: List<User>) {
        mDiffer.submitList(newList)
    }
}