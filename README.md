# mesomatic-examples
[![Build Status][travis-badge]][travis][![Dependencies Status][deps-badge]][deps][![Clojars Project][clojars-badge]][clojars][![Clojure version][clojure-v]](project.clj)

*Clojure and Mesos: Mesos Examples Using Mesomatic*

[![][logo]][logo-large]


#### Contents

* [About](#about-)
* [Dependencies](#dependencies-)
* [Set Up](#set-up-)
* [Usage](#usage-)
  * [Java Framework Port](#java-framework-port-)
  * [Java Exception Framework Port](#java-exception-framework-port-)
  * ['Hello, World!' Framework](#hello-world-framework-)
  * ['Hello, World!' Docker Framework](#hello-world-docker-framework-)
* [Documentation](#documentation-)
* [License](#license-)


## About [&#x219F;](#contents)

This project started as a port of the standard [Mesos Java
examples](https://github.com/apache/mesos/tree/master/src/examples/java) to Clojure and [Mesomatic](https://github.com/pyr/mesomatic). Since then, other examples have begun making their way into the codebase, and the repo is now home to several Mesomatic examples.

So far, these include:

* framework (IN PROGRESS) - [add description]
* hello-framework (IN PROGRESS) - A highly simplified, mostly minimal example of Mesomatic in action
* container-framework (IN PROGRESS) - [add description]
* exception-framework - a minimalist framework that only shows how an exception is handled by the Mesos framework

We plan on adding the multi-executor framework as well a few other examples.

Note that these examples, for the most part, attempt to demonstrate creating
Mesos frameworks using bare-bones Clojure (the exception to this is the
example which will demonstrate the use of the
[Component library](https://github.com/stuartsierra/component), allosing one
to treat the framework like a system). Also, unlike the Java examples, none of
these Mesomatic examples create bash scripts to kick off executors and 
frameworks from the command-line. Instead, they use `lein mesomatic` aliases 
(defined in `project.clj`).


## Dependencies [&#x219F;](#contents)

Mesomatic depends upon having the following installed and, where applicable,
running on your machine (or cluster):

* Java
* Maven
* ``lein``
* The native Mesos library (matching the version used in this project).

The latest version of these examples is built against Mesos 0.28.2 and
a mesomatic 0.28.0-r0. However, since there are Mesomatic features missing
and bugs fixed which haven't yet been merged upstream, you will need to clone
the fork that has these (from the ``mesomatic-examples`` clone directory):

```
$ mkdir checkouts
$ cd checkouts
$ git clone https://github.com/clojusc/mesomatic
```

Note that the default branch, ``deploy``, has merged all of the feature and
bug fix branches.

All other dependencies (including the Java bindings) are downloaded
automatically by ``lein`` when you run the examples.


## Set Up [&#x219F;](#contents)

You'll need to have mesos running in order to see these examples in action. If
you've built your own Mesos, you can switch to the build directory, and after
running ``make check`` (which run tests and generates necessary files/dirs for
you), you can start up a local mesos:

```bash
$ ./bin/mesos-local.sh
```

The examples need access to the native Mesos library. If you get errors like
the following

* ``Failed to load native Mesos library``
* ``java.lang.UnsatisfiedLinkError: no mesos in java.library.path``

then one of the techniques you may employ to address this is setting the
``MESOS_NATIVE_JAVA_LIBRARY`` environment variable in your OS shell. For
example, if you have built Mesos in ``/opt/mesos/0.28.2/build``, you can run:

```bash
$ export MESOS_NATIVE_JAVA_LIBRARY=/opt/mesos/0.28.2/build/src/.libs/libmesos.so
```


## Usage [&#x219F;](#contents)

With the necessary set up complete and after having changed directory to the
the ``mesomatic-examples`` clone directory, you can run the various example
as shown below. Note that the command line argument for the "master" is given
as "127.0.0.1:5050", and that will only work for you if that's the IP and port
your own Mesos install is running on. As such, be sure to update the commands
below as needed for your environment.


### Java Framework Port [&#x219F;](#contents)

```bash
$ lein mesomatic 127.0.0.1:5050 framework
```


### Java Exception Framework Port [&#x219F;](#contents)

```bash
$ lein mesomatic 127.0.0.1:5050 exception-framework
```


### Java Multiple-Executors Framework Port [&#x219F;](#contents)

TBD


### 'Hello, World!' Framework [&#x219F;](#contents)

```bash
$ lein mesomatic 127.0.0.1:5050 hello-framework
```


### 'Hello, World!' Docker Framework [&#x219F;](#contents)

```bash
$ lein mesomatic 127.0.0.1:5050 container-framework
```


### 'Hello, World!' + Component Framework [&#x219F;](#contents)

TBD


## Documentation [&#x219F;](#contents)

The project's auto-generated documentation (such that it is) is available here:

* [http://clojusc.github.io/mesomatic-examples/](http://clojusc.github.io/mesomatic-examples/)


## License [&#x219F;](#contents)

Copyright © 2016 Duncan McGreggor

Apache License, Version 2.0.


<!-- Named page links below: /-->

[travis]: https://travis-ci.org/clojusc/mesomatic-examples
[travis-badge]: https://travis-ci.org/clojusc/mesomatic-examples.png?branch=master
[deps]: http://jarkeeper.com/clojusc/mesomatic-examples
[deps-badge]: http://jarkeeper.com/clojusc/mesomatic-examples/status.svg
[logo]: resources/images/Apache-Mesos-logo-x250.png
[logo-large]: resources/images/Apache-Mesos-logo-x1000.png
[tag-badge]: https://img.shields.io/github/tag/clojusc/mesomatic-examples.svg?maxAge=2592000
[tag]: https://github.com/clojusc/mesomatic-examples/tags
[clojure-v]: https://img.shields.io/badge/clojure-1.8.0-blue.svg
[clojars]: https://clojars.org/mesomatic-examples
[clojars-badge]: https://img.shields.io/clojars/v/mesomatic-examples.svg
