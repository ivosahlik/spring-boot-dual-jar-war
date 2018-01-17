# Profile prod war

mvn clean package -Pprod

## Automatic deploy to tomcat
Edit Configuration -> Deployment -> + -> External Source -> .war



# Profile dev jar

mvn clean package -Pdev

java -jar target/dual.jar

## One terminal command :)
mvn clean package -Pdev; java -jar target/dual.jar

or best in launch app in Intellij Idea like SpringApplication.run :)



