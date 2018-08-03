package com.github.jvanheesch

pipelineJob('Generated-Build') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/jvanheesch/jenkins-pipelines.git')
            }
            scriptPath("src/main/java/com/github/jvanheesch/build/Jenkinsfile")
        }
    }
}

pipelineJob('Generated-Site') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/jvanheesch/jenkins-pipelines.git')
            }
            scriptPath("src/main/java/com/github/jvanheesch/site/Jenkinsfile")
        }
    }
}

pipelineJob('Generated-Site-Shit') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/jvanheesch/jenkins-pipelines.git')
            }
            scriptPath("src/main/java/com/github/jvanheesch/site-deploy/Jenkinsfile")
        }
    }
}

pipelineJob('Generated-Site-Multimodule') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/jvanheesch/jenkins-pipelines.git')
            }
            scriptPath("src/main/java/com/github/jvanheesch/site-multimodule/Jenkinsfile")
        }
    }
}

pipelineJob('Generated-Site-Child') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/jvanheesch/jenkins-pipelines.git')
            }
            scriptPath("src/main/java/com/github/jvanheesch/site-child-pom/Jenkinsfile")
        }
    }
}
