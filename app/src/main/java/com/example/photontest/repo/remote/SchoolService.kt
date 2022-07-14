package com.example.photontest.repo.remote

import com.example.photontest.model.SchoolDescription
import retrofit2.http.GET
import retrofit2.Response

interface SchoolService {
        @GET()
        suspend fun getSchoolDetailsList(): Response<List<SchoolDescription>>

}