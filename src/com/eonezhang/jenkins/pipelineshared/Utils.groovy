#!/usr/bin/groovy
package com.eonezhang.jenkins.pipelineshared
import com.cloudbees.groovy.cps.NonCPS

def helloWorld() {
	return "say hello from shared lib"
}

def getPomVersion(String path) {
	def contents = readFile(path)
	def project = new XmlSlurper().parseText(contents)
	return project.version.text().trim()
}

return this;