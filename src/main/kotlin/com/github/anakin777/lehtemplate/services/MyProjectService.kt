package com.github.anakin777.lehtemplate.services

import com.intellij.openapi.project.Project
import com.github.anakin777.lehtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
