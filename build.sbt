name := "Balance&Control"

version := "0.1"

scalaVersion := "2.11.12"


//Spark library version
val sparkVersion = "2.3.0"

//Jackson library version
val jacksonVersion = "2.6.6"

// https://mvnrepository.com/artifact/org.apache.spark/spark-core
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.3.0" % "provided"

// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.3.0" % "provided"

// https://mvnrepository.com/artifact/log4j/log4j
libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.17.1"
libraryDependencies += "org.apache.logging.log4j" % "log4j-api" % "2.17.1"
libraryDependencies += "org.apache.logging.log4j" % "log4j-1.2-api" % "2.17.1"

//mvnrepository for com.fasterxml.jackson.module » jackson-module-jaxb-annotations
libraryDependencies += "com.fasterxml.jackson.module" % "jackson-module-jaxb-annotations" % jacksonVersion