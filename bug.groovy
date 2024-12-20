```groovy
class MyClass {
    String name

    MyClass(String name) {
        this.name = name
    }

    String getName() {
        return name
    }
}

MyClass instance = new MyClass("John Doe")
println instance.name //This will print null instead of "John Doe"
```