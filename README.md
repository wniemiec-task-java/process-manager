![](https://github.com/wniemiec-task-java/process-manager/blob/master/docs/img/logo/logo.jpg)

<h1 align='center'>Process Manager</h1>
<p align='center'>Cross-platform process manager.</p>
<p align="center">
	<a href="https://github.com/wniemiec-task-java/process-manager/actions/workflows/windows.yml"><img src="https://github.com/wniemiec-task-java/process-manager/actions/workflows/windows.yml/badge.svg" alt=""></a>
	<a href="https://github.com/wniemiec-task-java/process-manager/actions/workflows/macos.yml"><img src="https://github.com/wniemiec-task-java/process-manager/actions/workflows/macos.yml/badge.svg" alt=""></a>
	<a href="https://github.com/wniemiec-task-java/process-manager/actions/workflows/ubuntu.yml"><img src="https://github.com/wniemiec-task-java/process-manager/actions/workflows/ubuntu.yml/badge.svg" alt=""></a>
	<a href="https://codecov.io/gh/wniemiec-task-java/process-manager"><img src="https://codecov.io/gh/wniemiec-task-java/process-manager/branch/master/graph/badge.svg?token=R2SFS4SP86" alt="Coverage status"></a>
	<a href="http://java.oracle.com"><img src="https://img.shields.io/badge/java-11+-D0008F.svg" alt="Java compatibility"></a>
	<a href="https://mvnrepository.com/artifact/io.github.wniemiec-task-java/process-manager"><img src="https://img.shields.io/maven-central/v/io.github.wniemiec-task-java/process-manager" alt="Maven Central release"></a>
	<a href="https://github.com/wniemiec-task-java/process-manager/blob/master/LICENSE"><img src="https://img.shields.io/github/license/wniemiec-task-java/process-manager" alt="License"></a>
</p>
<hr />

## ❇ Introduction
Process Manager allows you to perform operations on system processes on different platforms.

## ❓ How to use
1. Add one of the options below to the pom.xml file: 

#### Using Maven Central (recomended):
```
<dependency>
  <groupId>io.github.wniemiec-task-java</groupId>
  <artifactId>process-manager</artifactId>
  <version>LATEST</version>
</dependency>
```

#### Using GitHub Packages:
```
<dependency>
  <groupId>wniemiec.task.java</groupId>
  <artifactId>process-manager</artifactId>
  <version>LATEST</version>
</dependency>
```

2. Run
```
$ mvn install
```

3. Use it
```
[...]

import wniemiec.task.java.ProcessManager;

[...]

ProcessManager processManager = ProcessManager.getInstance();

System.out.println("Force kill process with PID 1234");
processManager.forceKillProcessWithPid(1234);

```

## 📖 Documentation
|        Property        |Parameter type|Return type|Description|Default parameter value|
|----------------|-------------------------------|-----------------------------|--------|
|forceKillProcessWithPid |`long`|`void`|Force kill process with a PID| - |

## 🚩 Changelog
Details about each version are documented in the [releases section](https://github.com/williamniemiec/wniemiec-task-java/process-manager/releases).

## 🤝 Contribute!
See the documentation on how you can contribute to the project [here](https://github.com/wniemiec-task-java/process-manager/blob/master/CONTRIBUTING.md).

## 📁 Files

### /
|        Name        |Type|Description|
|----------------|-------------------------------|-----------------------------|
|dist |`Directory`|Released versions|
|docs |`Directory`|Documentation files|
|src     |`Directory`| Source files|
