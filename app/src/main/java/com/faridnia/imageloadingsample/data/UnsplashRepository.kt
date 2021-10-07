package com.faridnia.imageloadingsample.data

import com.faridnia.imageloadingsample.api.UnsplashApi
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class UnsplashRepository @Inject constructor(private val api: UnsplashApi) {

}