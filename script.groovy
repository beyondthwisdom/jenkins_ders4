// script.groovy
def testBuildAndPushImage(String profile, String dockerHubRepo, String version, int buildNumber) {
    def imageTag = "${dockerHubRepo}:${version}-${buildNumber}"
    sh "./mvnw package jib:build -Djib.to.image=${imageTag} -DskipTests"
}

def prodBuildAndPushImage(String profile, String dockerHubRepo, String version, int buildNumber) {
    def mavenProfile = profile ? "-P${profile}" : ""
    def imageTag = "${dockerHubRepo}:${version}-${buildNumber}"
    sh "./mvnw package ${mavenProfile} jib:build -Djib.to.image=${imageTag} -DskipTests"
}

return this
