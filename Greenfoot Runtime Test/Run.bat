cd /D "%~dp0"
mvn clean install -DskipTests
java -jar target/greenfoot-maven-demo-1.0-SNAPSHOT-jar-with-dependencies.jar