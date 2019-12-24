## Scala Kata Starter

A starting point for a kata in Scala with nothing more than Docker to run our tests.

### Prerequisites

1. Docker

    + [Windows](https://docs.docker.com/docker-for-windows/install/)
    + [Mac](https://download.docker.com/mac/stable/Docker.dmg)

### Up & Running

Follow the usual TDD process of red, green and refactor. Simply run `docker-compose up` in a terminal for continuous testing

One can also run

```
docker-compose run tests sh -c "rm -rf target/ project/project/ project/target;sbt ~test"
```

if you want console colors and interaction.

Notice the command above and in the yml file contains `rm -rf target/ project/project/ project/target`. This is my current work around for the the fact that the test classes are not being output to the target directory between subsequent runs of the docker-compose command. If one doesn't include this command,  the following error will occur,

```
 object scalatest is not a member of package org
[error] import org.scalatest.FunSpec
[error]            ^
[error] /app/src/test/scala/KataSpec.scala:5:24: not found: type FunSpec
[error] class KataSpec extends FunSpec {
```
