package com.github.revolutionized.rainingjetthemes.services

import com.intellij.openapi.project.Project
import com.github.revolutionized.rainingjetthemes.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
