package com.github.jvanheesch

pipelineJob('Generated') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/jvanheesch/jenkins-pipelines.git')
            }
            scriptPath("src/main/java/com/github/jvanheesch/build/Jenkinsfile")
        }
    }
}
