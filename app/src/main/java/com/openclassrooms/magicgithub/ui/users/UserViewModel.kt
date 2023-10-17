package com.openclassrooms.magicgithub.ui.users

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.openclassrooms.magicgithub.data.model.User
import com.openclassrooms.magicgithub.data.repository.UserRepository
import com.openclassrooms.magicgithub.di.Injection


class UserViewModel : ViewModel() {

    // On a besoin d'instancier le repository une fois (cf. Singleton)
    private val userRepository: UserRepository = Injection.getRepository()

    // On utilise un MutableLiveData pour pouvoir modifier la liste des utilisateurs dans le ViewModel
    // On expose un LiveData (qui n'autorise pas les mpodifications) pour que l'activité puisse observer les changements
    private val _users: MutableLiveData<List<User>> = MutableLiveData()
    val users: LiveData<List<User>> = _users

    init {
        // On initialise la liste des utilisateurs à la création du ViewModel
        refresh()
    }

    private fun refresh() {
        _users.value = userRepository.getUsers()
    }

    fun generateRandomUser() {
        userRepository.addRandomUser()
        refresh()
    }

    fun deleteUser(user: User) {
        userRepository.deleteUser(user)
        refresh()
    }
}