package com.messieyawo.advancedfoodapp.data

import com.messieyawo.advancedfoodapp.data.local.LocalDataSource
import com.messieyawo.advancedfoodapp.data.network.RemoteDataSource
import javax.inject.Inject

class Repository @Inject constructor(
    remoteDataSource: RemoteDataSource,
    localDataSource: LocalDataSource
) {
    val remote = remoteDataSource
    val local = localDataSource
}