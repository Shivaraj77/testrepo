pipelineJob('Folder-A/BACKUP/MSR/DEV/New_Job1') {
  definition {
    cps {
    	script (''' 
pipeline { 
				agent any
				stages {
					stage ('creating a folder') {
						steps{ 
							echo "Welcome to FAI"
}
}
}
}

''')
    }
  }
}
