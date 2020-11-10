#!/usr/bin/env groovy

node
{

	parameters {
		string(defaultValue: "123", description: 'K', name: 'HELLO')
	}

	stage("print")
	{
		String par = "param string"
		echo 'running check'
		echo 'param ${HELLO}'
		echo '${par}'
	}
}
