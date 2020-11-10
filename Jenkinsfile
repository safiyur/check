#!/usr/bin/env groovy

node
{

	parameters {
		string(defaultValue: "", description: 'K', name: 'HELLO')
	}

	stage("print")
	{
		echo "running check"
		echo "param ${HELLO}"
	}
}
