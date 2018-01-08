#!/usr/bin/groovy
package com.eonezhang.jenkins.pipelineshared;

def helloWorld() {
	return "say hello from shared lib"
}

@NonCPS
def getProjectVersion() {
	def file = readFile('pom.xml')
	def project = new XmlSlurper().parseText(file)
	return project.version.text()
}

return this;