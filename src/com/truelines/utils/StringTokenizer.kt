package com.truelines.utils

class StringTokenizer: Iterable<String>, Iterator<String> {

    val text: String

    val delimiters: List<Char>

    val keepDelimiters: Boolean

    var tokens = listOf<String>()

    private var index = 0

    constructor(text: String, delimiters: String, keepDelimiters: Boolean = false) {
        this.text = text
        this.delimiters = delimiters.toList()
        this.keepDelimiters = keepDelimiters

        parse()
    }

    private fun parse() {
        val parsedTokens = mutableListOf<String>()

        var currentWord = ""
        text.forEach {
            if (delimiters.contains(it)) {
                parsedTokens.add(currentWord)
                currentWord = ""
                if (this.keepDelimiters) {
                    parsedTokens.add("$it")
                }
            } else {
                currentWord += it
            }
        }
        if (currentWord.isNotEmpty()) {
            parsedTokens.add(currentWord)
        }

        this.tokens = parsedTokens.toList()
    }

    override fun iterator(): Iterator<String> {
        return this.tokens.iterator()
    }

    override fun hasNext(): Boolean {
        return this.index < this.tokens.size
    }

    override fun next(): String {
        val next = this.tokens[index]
        this.index = this.index + 1  // this.tokens[index++] does not work
        return next
    }

    fun countRemainingTokens(): Int {
        return this.tokens.size - this.index
    }


}