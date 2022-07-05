import groovy.io.FileType

def list = []
WORKSPACE_PATH = "WORKSPACE".replace("\\","/")


def dir = new File("$(WORKSPACE_PATH)/JENKINS/Jobs")
dir.eachFileRecurse (FileType.FILES) { file ->
  list << file
}
list.each {

def TempPath = it.path.replace("\\","/")
JenkinsJobpath = TempPath.replace("${WORKSPACE_PATH}/","")
JenkinsJobPath = JenkinsJobPath.replace("JENKINS/Jobs/","")
ScriptFilePath = TempPath.replace("./JENKINS","JENKINS")
   pipelineJob(JenkinsJobPath) {
   defination{
        cps {
             script(readFileFromWorkspace(ScriptFilePath))
        }
   }
   
   }



}
