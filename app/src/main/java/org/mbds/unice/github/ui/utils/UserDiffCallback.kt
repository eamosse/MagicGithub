package org.mbds.unice.github.ui.utils

import androidx.recyclerview.widget.DiffUtil
import org.mbds.unice.github.data.model.User

class UserDiffCallback : DiffUtil.ItemCallback<User>() {

    override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
        return oldItem.id === newItem.id
    }

    override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
        return oldItem.login == newItem.login && oldItem.avatarUrl == newItem.avatarUrl
    }
}