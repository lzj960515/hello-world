package com.github.lzj960515.helloworld.services

import com.intellij.openapi.project.Project
import com.github.lzj960515.helloworld.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
