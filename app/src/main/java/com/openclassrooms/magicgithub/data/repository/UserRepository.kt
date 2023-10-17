package com.openclassrooms.magicgithub.data.repository

import com.openclassrooms.magicgithub.data.api.ApiService
import com.openclassrooms.magicgithub.data.model.User

class UserRepository(
    private val apiService: ApiService
) {
    fun getUsers(): List<User> {
        TODO("Should return the list of users retrieved from the api service")
    }

    fun addRandomUser() {
        TODO("Should add a random user")
    }

    fun deleteUser(user: User) {
        TODO("Should remove the user")
    }
}