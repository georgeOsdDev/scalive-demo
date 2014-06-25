# Scalive-demo

Demo project for scalive for [Scalive # 1](http://connpass.com/event/6903)

# Usage
### Clone project

* `git clone https://github.com/georgeOsdDev/scalive-demo`

### Compile and Run xitrum server

* `cd scalive-demo`
* `sbt/sbt xitrum-package`
* `./target/xitrum/script/runner demo.Boot`

### Check process

* `open http://localhost:8000`

### Run scalive from another terminal.

* `cd path/to/scalive-demo/script/`
* `./scalive`

Current JVM Processes will be listed like below.

		JVM processes:
		#pid	Display name
		15278
		25424	demo.Boot
		77008	com.android.ddms.Main
		25861	scalive.AgentLoader /Users/oshidatakeharu/Project/scala/xitrum/samples/scalive-demo/script:/Users/oshidatakeharu/Project/scala/xitrum/samples/scalive-demo/lib

### Attach specified pid.

* `./scalive $PID`

Remote REPL will be started

		[Scalive] Attached to remote process at port 57668
		Welcome to Scala version 2.11.1 (Java HotSpot(TM) 64-Bit Server VM, Java 1.7.0_45).
		Type in expressions to have them evaluated.
		Type :help for more information.

		scala>

### Do some stuff

		scala>import demo.model.Queue
		scala>Queue.enqueu(123456)

### Reload browser

## About Xitrum

See : http://xitrum-framework.github.io/

## Licence
MIT