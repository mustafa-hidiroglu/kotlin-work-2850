// Task 5.4.2: String extension properties

val String.isTooLong: Boolean
    get() = this.length > 20
