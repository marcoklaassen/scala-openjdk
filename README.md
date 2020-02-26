# Scala S2I Builder Image

This is a s2i demo to show how to run scala applications per source to image in a docker container.

* You need S2I to execute s2i builds: `$ brew install source-to-image`
* You can build the scala-openjdk docker-image with `$ make -C s2i-scala build`.
* With `$ s2i build scala-sample scala-openjdk scala-sample` you can start a s2i build with the builder image created before (`scala-openjdk`).
* Run docker image with deployed scala app with `$ docker run -p 8080:8080 scala-sample`
