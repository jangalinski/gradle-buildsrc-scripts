package toolisticon

tasks.register("hello-world-custom") {
  doLast {
    println("Hello world - but Custom!")
  }
}
