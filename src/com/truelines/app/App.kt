package com.truelines.app

import com.truelines.common.CommonProps
import com.truelines.i18n.Lang
import com.truelines.logo.logo
import com.truelines.material.Button
import com.truelines.material.Card
import com.truelines.material.Grid
import com.truelines.material.MenuItem
import com.truelines.material.Select
import com.truelines.material.TextField
import com.truelines.material.Typography
import kotlinext.js.js
import material.Colors
import material.ThemeOptions
import material.createMuiTheme
import material.mCssBaseline
import material.mThemeProvider
import org.w3c.dom.HTMLInputElement
import org.w3c.dom.events.Event
import react.RBuilder
import react.RComponent
import react.RState
import react.ReactElement
import react.router.dom.switch
import react.setState
import kotlin.browser.document
import kotlin.random.Random

interface AppState : RState {
    var lang: Lang
    var startButtonLabel : String
    var started: Boolean
    var errorText: String
    var numberMax: Int
    var number1: Int?
    var number2: Int?
    var result: Int?
    var resultInput: Int?
    var numberOfQuestions: Int
    var remainingQuestions : Int
    var goodAnswer: Int
    var gaveBadAnswer: Boolean
    var tableNumber: Int
}

interface AppProps: CommonProps

class App : RComponent<AppProps, AppState>() {

    private var themeColor = "light"

    override fun AppState.init() {
        lang = Lang.getNavigatorLanguage()
        started = false
        startButtonLabel = "Démarrer"
        errorText = ""
        numberMax = 11
        number1 = null
        number2 = null
        result = null
        resultInput = null
        numberOfQuestions = 10
        remainingQuestions = 10
        goodAnswer = 0
        gaveBadAnswer = false
        tableNumber = -1
    }

    fun renew() {
        setState {
            number1 = Random.nextInt(1, state.numberMax)
            number2 = if (tableNumber == -1) {
                Random.nextInt(1, state.numberMax)
            } else {
                tableNumber
            }
            result = number1!! * number2!!
            errorText = ""
            resultInput = null
        }
    }

    override fun RBuilder.render() {

        mCssBaseline()

        // Create an object with child objects already created and effectively cast it to ThemeOptions - our demo theme
        // has a lighter primary color than the default theme
        @Suppress("UnsafeCastFromDynamic")
        val themeOptions: ThemeOptions = js("""
            ({
                palette: { 
                    type: 'placeholder', 
                    primary: {
                        main: 'placeholder'
                    },
                    secondary: {
                        main: 'placeholder'
                    }
                }
            })
            """
        )
        themeOptions.palette?.type = themeColor
        themeOptions.palette?.primary.main = Colors.Blue.shade600.toString()
        themeOptions.palette?.secondary.main = Colors.Red.accent200.toString()

        mThemeProvider (theme = createMuiTheme(themeOptions)) {
            Grid {
                attrs.container = true
                attrs.direction = "column"
                attrs.alignItems = "center"
                attrs.justify = "flex-start"
                attrs.spacing = 2
                attrs.style = kotlinext.js.js {
                    width = "100%"
                    margin = "40px"
                    height = "100%"
                    flexWrap = "nowrap"
                }

//                switch {

//                    route(path = ROOT_PATH, exact = true) {


                        val checkResult = fun(e: Event) {
                            e.stopPropagation()

                            if (state.result == state.resultInput) {
                                setState {
                                    remainingQuestions--
                                    if (!gaveBadAnswer) goodAnswer++
                                    gaveBadAnswer = false
                                }
                                renew()
                            } else {
                                setState {
                                    errorText = "${resultInput} n'est pas la bonne réponse. Essaie à nouveau."
                                    resultInput = null
                                    gaveBadAnswer = true
                                }
                            }

                        }

                        Card {
                            attrs.style = js {
                                width = "40%"
                                padding = "20px"
                            }


                            Grid {
                                attrs.item = true

                                attrs.style = js {
                                    marginBottom = "40px"
                                }

                                logo(logoHeight = 70) {}
                            }


                            Grid {
                                attrs.item = true

                                Grid {
                                    attrs.container = true
                                    attrs.direction = "row"
                                    attrs.justify = "center"
                                    attrs.spacing = 3


                                    Grid {
                                        attrs.item = true

                                        Typography {
                                            attrs.variant = "h6"
                                            attrs.component = "p"
                                            +"Table: "
                                        }
                                    }

                                    Grid {
                                        attrs.item = true

                                        Select {
                                            attrs.defaultValue = state.tableNumber
                                            attrs.autoWidth = true
                                            attrs.disabled = state.started
                                            attrs.onChange = {
                                                setState {
                                                    tableNumber = it.target.asDynamic().value
                                                }
                                            }

                                            for (i in 1..10) {
                                                MenuItem {
                                                    attrs.value = i
                                                    +"$i"
                                                }
                                            }
                                            MenuItem {
                                                attrs.value = -1
                                                +"Toute"
                                            }
                                        }
                                    }

                                }
                            }

                            Grid {
                                attrs.item = true

                                Grid {
                                    attrs.container = true
                                    attrs.direction = "row"
                                    attrs.justify = "center"
                                    attrs.spacing = 3


                                    Grid {
                                        attrs.item = true

                                        Typography {
                                            attrs.variant = "h6"
                                            attrs.component = "p"
                                            +"Nombre de questions: "
                                        }
                                    }

                                    Grid {
                                        attrs.item = true

                                        Select {
                                            attrs.defaultValue = state.numberOfQuestions
                                            attrs.autoWidth = true
                                            attrs.disabled = state.started
                                            attrs.onChange = {
                                                setState {
                                                    numberOfQuestions = it.target.asDynamic().value
                                                }
                                            }

                                            MenuItem {
                                                val value = 10
                                                attrs.value = value
                                                +"$value"
                                            }
                                            MenuItem {
                                                val value = 20
                                                attrs.value = value
                                                +"$value"
                                            }
                                            MenuItem {
                                                val value = 30
                                                attrs.value = value
                                                +"$value"
                                            }
                                        }
                                    }
                                }
                            }

                            Grid {
                                attrs.item = true

                                attrs.style = js {
                                    marginTop = "30px"
                                }

                                Grid {
                                    attrs.item = true

                                    Button {
                                        attrs.color = "primary"
                                        attrs.variant = "outlined"
                                        attrs.onClick = {
                                            if (!state.started) {
                                                setState {
                                                    number1 = Random.nextInt(1, state.numberMax)
                                                    number2 = if (tableNumber == -1) {
                                                        Random.nextInt(1, state.numberMax)
                                                    } else {
                                                        tableNumber
                                                    }
                                                    result = number1!! * number2!!
                                                    errorText = ""
                                                    resultInput = null
                                                    startButtonLabel = "Recommencer"
                                                    started = true
                                                    goodAnswer = 0
                                                    gaveBadAnswer = false
                                                    remainingQuestions = numberOfQuestions
                                                }
                                            } else {
                                                setState {
                                                    startButtonLabel = "Démarrer"
                                                    started = false
                                                }
                                            }
                                        }
                                        +state.startButtonLabel
                                    }
                                }

                            }

                            Grid {
                                attrs.item = true

                                Typography {
                                    attrs.variant = "h2"
                                    attrs.component = "p"
                                    attrs.style = js {
                                        marginTop = "50px"
                                    }
                                    if (state.remainingQuestions > 0) {
                                        if (state.started) {
                                            +"${state.number1} x ${state.number2} = ?"
                                        } else {
                                            +"Prêt ?"
                                        }
                                    } else  {
                                        +"Ton score : ${state.goodAnswer} / ${state.numberOfQuestions}"
                                    }
                                }
                            }

                            if (state.started && state.remainingQuestions > 0) {
                                Grid {
                                    attrs.item = true
                                    attrs.style = js {
                                        marginTop = "40px"
                                    }

                                    Grid {
                                        attrs.container = true
                                        attrs.direction = "row"
                                        attrs.justify = "center"
                                        attrs.spacing = 3

                                        Grid {
                                            attrs.item = true
                                            TextField {
                                                attrs.required = true
                                                attrs.autoFocus = true
                                                attrs.id = "result-input"
                                                attrs.label = "Réponse"
                                                attrs.placeholder = "Réponse"
                                                attrs.error = !state.errorText.isEmpty()
                                                attrs.helperText = state.errorText
                                                attrs.type = "number"
                                                attrs.value = state.resultInput ?: ""

                                                attrs.style = js {
                                                    width = "300px"
                                                }

                                                attrs.InputProps = kotlinext.js.js {
                                                    onKeyDown = fun(e: Event) {
                                                        when (e.asDynamic().key) {
                                                            "Enter" -> {
                                                                console.info("Enter key down")
                                                                e.preventDefault()
                                                                checkResult(e)
                                                            }
                                                        }
                                                    }
                                                }
                                                attrs.onChange = {
                                                    val valueInput =
                                                            (document.getElementById("result-input")
                                                                    as HTMLInputElement).value

                                                    setState {
                                                        resultInput = if (valueInput.isEmpty()) {
                                                            null
                                                        } else {
                                                            valueInput.toInt()
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        Grid {
                                            attrs.item = true
                                            Button {
                                                attrs.color = "primary"
                                                attrs.variant = "outlined"
                                                attrs.onClick = checkResult
                                                +"Vérifier"
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
//                }
//            }
        }


    }

    companion object {
        const val ROOT_PATH = "/"
        const val LOGIN_PATH = "${ROOT_PATH}login"
    }
}


fun RBuilder.app(handler: AppProps.() -> Unit): ReactElement {
    return child(App::class) {
        this.attrs(handler)
    }
}
