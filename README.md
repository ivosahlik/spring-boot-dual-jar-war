# Profile prod war

mvn clean package -Pprod

## Automatic deploy to tomcat
Edit Configuration -> Deployment -> + -> External Source -> .war



# Profile dev jar

mvn clean package -Pdev

java -jar target/dual.jar

## One terminal command for linux, mac :)
mvn clean package -Pdev; java -jar target/dual.jar

## One terminal command for windows :(
mvn clean package -Pdev && java -jar target/dual.jar

or best to launch app is Intellij Idea like SpringApplication.run :)



