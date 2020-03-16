package com.truelines.logo

import kotlinext.js.js
import kotlinx.html.js.onClickFunction
import kotlinx.html.style
import org.w3c.dom.events.Event
import react.RBuilder
import react.dom.a
import react.dom.div
import react.dom.img

@JsModule("src/com/truelines/logo/TrueLines.png")
external val airstreamLogo: dynamic

fun RBuilder.logo(logoHeight: Int = 100, clickAction: (Event) -> Unit) {
    div("Logo") {
        attrs.style = js {
            cursor = "pointer"
        }
        attrs.onClickFunction = clickAction
        a ("https://fabfont.github.io/truelines.github.io") {
            img(alt = "TrueLines", src = airstreamLogo, classes = "Logo") {
                attrs.style = js {
                    height = "${logoHeight}px"
                }
            }
        }
    }
}
