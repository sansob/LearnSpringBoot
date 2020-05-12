package com.apitest.demo.models

import javax.validation.constraints.NotBlank

class Profile {
    @get: NotBlank
//    @set: NotBlank
    var name: String = ""

    @get: NotBlank
//    @set: NotBlank
    var address: String = ""

    @get:NotBlank
//    @set: NotBlank
    var birthday: String = ""
}