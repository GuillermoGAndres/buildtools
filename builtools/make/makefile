#Usando make con archivo java
#
#tarjet: dependencies
#        commands
#

run: hello.jar
	java -cp Hello.jar HelloWorld Guillermo

hello.jar: HelloWorld.class
	jar -cf Hello.jar HelloWorld.class

HelloWorld.class: HelloWorld.java
	javac HelloWorld.java


