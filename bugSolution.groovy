```groovy
class MyClass {
    String name

    MyClass(String name) {
        this.name = name //Explicitly assign to the property using 'this.'
    }

    String getName() {
        return name
    }
}

MyClass instance = new MyClass("John Doe")
println instance.name //This will now print "John Doe"
```