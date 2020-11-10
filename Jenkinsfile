#!/usr/bin/env groovy

properties([
		parameters([
				List(description: 'Environment for which configMap is to be created', name: 'HELLO')
		])
])


//def param = params.HELLO
println "Incoming Pipeline Library Branch Parameter: ${params.HELLO}"

node
{

	stage("print")
	{
		String par = "param string"
		echo 'running check'
		//echo "param ${HELLO}"
		echo "${par}"
		//echo "${param}"
	}
}
