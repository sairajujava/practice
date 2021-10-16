# practice

1 . Clone the project  from Repository into your workspace

2 . Open your Mysql workbench and execute the below commands

create database sbatch;
use sbatch;

3 . copy the tables from sql folder and execute the talbes namely tbl_user , tbl_student and data as itis 

4 . open eclipse or sts import the maven project

5 . Build the project using below commands
mvn clean install

6 . If you already configure Tomcat just comment the below code from pom.xml then build the project again.

<plugin>
				<groupId>org.eclipse.jetty</groupId>
				<artifactId>jetty-maven-plugin</artifactId>
				<!-- <version>9.2.11.v20150529</version> -->
				<version>9.4.12.v20180830</version>
				<configuration>
					<scanIntervalSeconds>10</scanIntervalSeconds>
					<webApp>
						<contextPath>/ums/</contextPath>
					</webApp>
				</configuration>
			</plugin>

7 . If you ar not using Tomcat then dont comment the above jetty plugin 
8 . Then go to your project source location and copy the path then open command prompt. the nexecute below jetty server command

mvn clean jetty:run

9 . Then immideatly jeety server will start on port no : 8080

10 . access the proect using below link

http://localhost:8080/ums/