#!/usr/bin/groovy
package com.eonezhang.jenkins.pipelineshared
import com.cloudbees.groovy.cps.NonCPS

def helloWorld() {
	return "say hello from shared lib"
}

@NonCPS
def getProjectVersion() {
	def file = readFile(pwd() + "/pom.xml")
	def project = new XmlSlurper().parseText(file)
	return project.version.text()
}

return this;