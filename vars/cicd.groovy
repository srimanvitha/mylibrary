def newUrl(repo)
{
  git 'https://github.com/srimanvitha/${repo}.git'
}
def newBuild()
{
   sh 'mvn package'
}
def newDeploy(jobname,ipaddress,appname)
{
  sh "scp /var/lib
}
def runTest(jobname){
sh 'java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar ' 
}
