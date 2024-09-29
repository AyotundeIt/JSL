def call(String stageName){
  
  if ("${stageName}" == "Build")
     {
       sh "tool name: '3.9.9'/bin/mvn clean package"
     }
  else if ("${stageName}" == "SonarQube Report")
     {
       sh "echo Running Code Quality Report analysis"
       sh "mvn clean sonar:sonar"
     }
  else if ("${stageName}" == "Upload Into Nexus")
     {
       sh "mvn clean deploy"
     }
}
