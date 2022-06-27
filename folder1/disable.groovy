pipelineJob('Folder-A/BACKUP/MSR/DEV/New_Job1') {
  definition {
    cps {
    	script (''' 
job ('folder2/f2.groovy'){ disabled() }

''')
    }
  }
}
