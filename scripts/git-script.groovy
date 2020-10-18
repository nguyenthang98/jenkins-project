def job = hudson.model.Hudson.instance.getItem("Test-pipeline")
def builds = job.getBuilds()
builds[0].getChangeSets().each {
  println('Num of commits in this build ' + (it.getLogs()).size() )
  println("it instanceof " + it.getClass() )

  it.getLogs().each {
    println('commit data : '  + it.getRevision() + ' ' + it.getAuthorEmail() + ' ' + it.getMsg()) 
    println('files changed: ')
    it.getAffectedFiles().each {
      println('\t - ' + it.getPath())
    }
  }
}
