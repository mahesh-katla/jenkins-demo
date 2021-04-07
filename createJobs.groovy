pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/mahesh-katla/spring-boot-api-example.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}