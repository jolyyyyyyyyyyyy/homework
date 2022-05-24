fun main(args: Array<String>) {

  val bookOne: Book? = null
    val bookTwo: Book? =Book(price =10, wordCount = 900)

    bookOne?.let {
        buy(it)
    }
    bookTwo?.let {
        buy(it)
    }

}

fun buy(publication: Publication) {
    println("The  purchase is complete." +
            "The purchase amount was ${publication.price}")
}

interface Publication {
    val price: Int
    val wordCount: Int

    fun getType(): String

    }

class Book(override val price: Int, override val wordCount: Int) : Publication {
    override fun getType() =
        when {
            wordCount <= 1000 -> "Flash Fiction"
            wordCount <= 7500 -> "Short Story"
            else -> {
                "Novel"
            }
        }
    }

class Magazine(override val price: Int, override val wordCount: Int) : Publication {
    override fun getType() =
        "Magazine"
        }