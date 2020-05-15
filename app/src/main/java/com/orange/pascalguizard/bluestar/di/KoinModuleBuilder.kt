package com.orange.pascalguizard.bluestar.di

import org.koin.core.module.Module
import org.koin.dsl.module

interface KoinModuleBuilder {
    val appModule: Module
}

class KoinModuleBuilderImpl: KoinModuleBuilder {

    override val appModule = module {

    }
}