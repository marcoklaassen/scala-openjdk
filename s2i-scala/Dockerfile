# scala-openjdk
FROM openjdk

LABEL maintainer="Marco Klaassen <klaassen.marco@googlemail.com>"


LABEL io.k8s.description="Platform for building scala apps" \
      io.k8s.display-name="Scala 2.12.10" \
      io.openshift.expose-services="8080:http" \
      io.openshift.tags="builder,scala,openjdk,java"

RUN curl https://bintray.com/sbt/rpm/rpm | tee /etc/yum.repos.d/bintray-sbt-rpm.repo
RUN yum install -y sbt && \
yum clean all -y

# cache sbt version 1.3.8
RUN mkdir project && echo "sbt.version = 1.3.8" > project/build.properties
RUN sbt initialize

LABEL io.openshift.s2i.scripts-url=image:///usr/libexec/s2i
COPY ./s2i/bin/ /usr/libexec/s2i

EXPOSE 8080

CMD ["/usr/libexec/s2i/usage"]
