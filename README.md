# AdCampainsProject
 REST endpoints allowing external calls to gain access to these follow functions : 
 
	* POST addCampain
	
	* GET getCampain
 
#Import into Eclipse IDE

 1)git clone https://github.com/codeonjava/AdCampainsProject.git
 
 2)Import this project on Eclipse as Gradle project
 
 3) Build the project
		
		
#How to Run the application

*There are two ways to run this eclipse

	Create war file and run deploy that war file into Web server.
	For that:
		Execute Gradle task "war" to create a war, The newly created war will reside inside build/libs folder
		copy that war and deploy into web server like tomcat/jetty
		
*Directly use the jettyRunwar to run the appliction in eclipse.

#Junit TestCases

Junit Test cases are reside inside src/test/java

