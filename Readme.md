# Springboot Example

[![Build Status](http://169.45.158.170:31000/buildStatus/icon?job=microserviceorg/springboot-app/master)](http://169.45.158.170:31000/job/microserviceorg/springboot-app/master)
[![HitCount](http://hits.dwyl.com/microserviceorg/springboot-app.svg)](http://hits.dwyl.com/microserviceorg/springboot-app)
[![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat)](https://github.com/dwyl/esta/issues)

### Build Application

```
mvn clean install
```

### Run Application
- If default application properties needs to be used then (In our example, profile is set to dev):
  > java -jar target/springboot-app-0.0.1-SNAPSHOT.jar
  
- If say application-prod.properties needs to be used then
  > java -jar -Dspring.profiles.active=prod target/springboot-app-0.0.1-SNAPSHOT.jar
