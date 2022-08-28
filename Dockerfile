From tomcat:8-jre8 

# Maintainer
MAINTAINER "valaxytech" 

# copy war file on to container 
COPY ./team-2-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps
