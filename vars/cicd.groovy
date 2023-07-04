def newUrl(repo)
{
  git 'https://github.com/srimanvitha/${repo}.git'
}
def newBuild()
{
   sh 'mvn package'
}
def newDeploy(jobname,ip,appname)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat/webapps/${appname}.war"
}
def runTest(jobname){
sh 'java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar '
  
}
