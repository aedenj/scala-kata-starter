## Scala Kata Starter

A starting point for a kata in Scala with nothing more than Docker to run our tests.

### Prerequisites

1. Docker

    + [Windows](https://docs.docker.com/docker-for-windows/install/)
    + [Mac](https://download.docker.com/mac/stable/Docker.dmg)

### Up & Running

Follow the usual TDD process of red, green and refactor. Simply run

```
docker-compose run tests sh -c "sbt '~ ;clean;test'"
```
