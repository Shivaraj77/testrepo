pipelineJob('Folder-A/BACKUP/MSR/DEV/New_Job1') {
  definition {
    cps {
    	script (''' 
job ('folder1/f1.groovy'){ disabled() }

''')
    }
  }
}
