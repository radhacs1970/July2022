1. Create aproject called samplejdbc
  mvn archetype:generate
  groupid - com.hexa
  artifactid - samplejdbc

1.  copy the myscripts.sql, if need change db name and 
execute in mysql 
2. Add the mysql dependency from git- pom.xml
3. create a file calle Custselectdb.java in the com/hexa folder
4. copying the content from git  to this file

5. compiling using
  mvn clean compile

6. execute using
  mvn exec:java -Dexec.mainClass=com.hexa.Custselectdb 
