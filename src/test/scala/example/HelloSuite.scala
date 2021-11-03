package example

class HelloSuite extends munit.FunSuite {
  test("numbers") {
    val obtained = 42
    val expected = 42
    assertEquals(obtained, expected)
  }

  test("Hello World") {
    assertEquals(Hello.greeting, "Hello World")
  }
}