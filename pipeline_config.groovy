library_sources {
  github {
    org = "TJMS122325"
    repo = "jenkins-jte-libraries"
    branch = "main"
  }
}

libraries {
  javaProject
}

project {
  name = "demo-service-1"
  artifact = "demo-service-1"
  dockerOrg = "demo-org"
  sonarGroup = "com.demo"
  mavenSettingsId = "demo-maven-settings"
  portainer {
    url = "https://portainer.example"
    stackName = "demo-service-1-stack"
    testingStackName = "demo-service-1-testing"
  }
}
