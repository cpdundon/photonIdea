package com.example.photontest.repo

import com.example.photontest.model.SchoolDescription
import com.example.photontest.repo.remote.SchoolRetroInstance
import retrofit2.Response

object SchoolRepo {

    suspend fun getSchoolDescriptionList():
            Response<List<SchoolDescription>> =
                SchoolRetroInstance.schoolService.getSchoolDetailsList()
}
