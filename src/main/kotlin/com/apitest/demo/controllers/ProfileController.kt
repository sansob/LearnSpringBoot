package com.apitest.demo.controllers

import com.apitest.demo.models.Profile
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ArticleController() {

    @GetMapping("/profiles")
    fun getAllArticles(): ArrayList<Profile> {
        var listAll: ArrayList<Profile> = arrayListOf()

        var profiles = Profile()

        profiles.name = "Hasan"
        profiles.address = "Semarang"
        profiles.birthday = "testing"
        listAll.add(profiles)


        profiles.name = "Hasan"
        profiles.address = "Semarang"
        profiles.birthday = "testing"
        listAll.add(profiles)

        return listAll
    }

}