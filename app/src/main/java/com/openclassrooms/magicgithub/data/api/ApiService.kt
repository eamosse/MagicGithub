package com.openclassrooms.magicgithub.data.api

import com.openclassrooms.magicgithub.data.model.User

interface ApiService {
    fun getUsers(): List<User>
    fun addRandomUser()
    fun deleteUser(username: User)
}