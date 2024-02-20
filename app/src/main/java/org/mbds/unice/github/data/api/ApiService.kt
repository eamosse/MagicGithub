package org.mbds.unice.github.data.api

import org.mbds.unice.github.data.model.User

interface ApiService {
    fun getUsers(): List<User>
    fun addRandomUser()
    fun deleteUser(username: User)
}