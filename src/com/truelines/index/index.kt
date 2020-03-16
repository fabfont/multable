package com.truelines.index

import com.truelines.app.app
import kotlinext.js.require
import kotlinext.js.requireAll
import react.dom.render
import react.router.dom.browserRouter
import kotlin.browser.document

fun main(args: Array<String>) {
    requireAll(require.context("src", true, js("/\\.css$/")))

    render(document.getElementById("root")) {
        browserRouter {

            app { }
        }
    }
}
