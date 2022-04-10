fun main(args: Array<String>) {
    println("Program arguments: ${args.joinToString()}")
}
    interface Publication {
        abstract val notnull: Any
        abstract var n: Any
        val price: Int
        val wordCount: Int

        fun wordCount1() {
            var wordCount1: Int
        }

        fun getType(text: String): String? {
            return null
        }
        class Book(name: String){

                fun Book(wordCount: Int): Unit {
                    if (wordCount < 1000)
                        println("Flash Fiction")
                    else if (wordCount < 7500) {
                        println("Short Story")
            }
                    else {
                        println("Novel")
                    }
                }
        }
        class Magazine(){
            fun Magazine(): Unit {
                println("Magazine")
            }
        }

        fun buy(){
            var Publication: String = "n"
            n = notnull.toString()
            println("The purchase is complete. The purchase amount was $price")
        }

        fun Book() {
            var a: String? = null
            var b: Int? = 25
            a?.let {
                print(a.length)
            }
            b?.let {
                print (buy())
            }
        }
    }

