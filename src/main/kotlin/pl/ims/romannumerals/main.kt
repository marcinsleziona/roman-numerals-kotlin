package pl.ims.romannumerals

fun main(args: Array<String>) {
    if (args.size != 1) {
        usage()
        return
    }
    val arabicToRomanConverter = ArabicToRomanConverter()
    println(arabicToRomanConverter.convert(args[0]))
}

private fun usage() {
    println("java pl.ims.romannumerals.Convert <number_to_convert>")
}

