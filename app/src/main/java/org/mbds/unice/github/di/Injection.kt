package org.mbds.unice.github.di

import org.mbds.unice.github.data.api.FakeApiService
import org.mbds.unice.github.data.repository.UserRepository

object Injection {
    private var repository: UserRepository? = null

    @JvmStatic
    fun getRepository(): UserRepository {
        if (repository == null) {
            repository = UserRepository(FakeApiService())
        }
        return repository!!
    }
}