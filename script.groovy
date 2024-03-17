// script.groovy
def testBuildAndPushImage(String profile, String dockerHubRepo, String version, int buildNumber) {
    def imageTag = "${dockerHubRepo}:${version}-${buildNumber}"
    sh "./mvnw package jib:build -DskipTests -Djib.to.image=${imageTag}"
}

def prodBuildAndPushImage(String profile, String dockerHubRepo, String version, int buildNumber) {
    def mavenProfile = profile ? "-P${profile}" : ""
    def imageTag = "${dockerHubRepo}:${version}-${buildNumber}"
    sh "./mvnw package ${mavenProfile} jib:build -DskipTests -Djib.to.image=${imageTag}"
}

return this
