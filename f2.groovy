import groovy.io.FileType

def list = new File("$WORKSPACE/JENKINS/Folder.txt").text.readLines()


list.each {foldername->
	
	folder(foldername) {
	       description('')
	}


}
