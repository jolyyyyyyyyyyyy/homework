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

        fun getType(text: String): String
    }
        abstract class Book(name: String) : Publication {

                fun book(wordCount: Int): Unit {
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
        abstract class Magazine() : Publication {
            fun magazine(): Unit {
                println("Magazine")
            }
        }

        fun buy(){
            var publication: String = "n"
            var n = notnull.toString()
            val price = 100
            println("The  purchase is complete. The purchase amount was $price")
        }

        fun book() {
            val a: String? = null
            val b: Int? = 25
            a?.let {
                print(a.length)
            }
            b?.let {
                print (buy())
            }
        }


