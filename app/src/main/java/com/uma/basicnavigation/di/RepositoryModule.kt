package com.uma.basicnavigation.di

import com.uma.basicnavigation.repository.AppDataManager
import org.koin.dsl.module

val repositoryModule = module {
    single {
        AppDataManager(get())
    }
}