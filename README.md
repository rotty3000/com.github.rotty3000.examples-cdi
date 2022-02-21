# com.github.rotty3000.examples-cdi

A example Maven project using OSGi CDI Integration with all the trimmings (build, test, run, ci)

[![CI Build](https://github.com/rotty3000/com.github.rotty3000.examples-cdi/actions/workflows/maven.yml/badge.svg)](https://github.com/rotty3000/com.github.rotty3000.examples-cdi/actions/workflows/maven.yml)

### Build and Test

Build and test the project following traditional maven conventions.

```bash
# build and run all test
mvn verify

# run for continuous development, deployment & interaction via gogo shell
mvn bnd-run:run@executable

# install artifacts for consumption in other projects
mvn install
```
