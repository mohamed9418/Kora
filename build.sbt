name := """kora"""
organization := "com.kora"

version := "1.0-SNAPSHOT"


lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayEbean)
scalaVersion := "2.12.4"

libraryDependencies += guice
libraryDependencies += jdbc
libraryDependencies += evolutions
libraryDependencies += cache
libraryDependencies += javaWs
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.41"
