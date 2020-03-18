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
    var resultInput: String
    var numberOfQuestions: Int
    var remainingQuestions : Int
    var goodAnswer: Int
    var gaveBadAnswer: Boolean
    var tableNumber: Int
    var checkDisabled: Boolean
    var operation: Operation
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
        resultInput = ""
        numberOfQuestions = 10
        remainingQuestions = 10
        goodAnswer = 0
        gaveBadAnswer = false
        tableNumber = -1
        checkDisabled = false
        operation = Operation.MULTIPLICATION
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
                attrs.direction = "row"
                attrs.justify = "center"
                attrs.spacing = 2
                attrs.style = js {
                    width = "100%"
                    margin = "40px auto auto auto"
                    height = "100%"
                    flexWrap = "nowrap"
                }

                Grid {
                    attrs.item = true
                    attrs.xs = 11
                    attrs.md = 6
                    attrs.lg = 4

                    Card {
                        attrs.style = js {
                            width = "100%"
                            padding = "20px"
                        }

                        Grid {
                            attrs.container = true
                            attrs.direction = "column"
                            attrs.justify = "flex-start"
                            attrs.alignItems = "stretch"
                            attrs.spacing = 2

                            Grid {
                                attrs.item = true

                                attrs.style = js {
                                    marginBottom = "40px"
                                }

                                logo(logoHeight = 70) {}
                            }

                            Grid {
                                attrs.item = true
                                attrs.style = js {
                                    // Don't know why I need to set the height only for this container
                                    // and not for the other. Otherwise, when selecting "Addition", the height is
                                    // much more higher than for "Multiplication"
                                    height = "45px"
                                }

                                Grid {
                                    attrs.container = true
                                    attrs.direction = "row"
                                    attrs.justify = "center"
                                    attrs.spacing = 3

                                    Grid {
                                        attrs.item = true
                                        attrs.xs = 6

                                        Typography {
                                            attrs.variant = "h6"
                                            attrs.component = "p"
                                            attrs.align = "right"
                                            +"Opération :"
                                        }
                                    }

                                    Grid {
                                        attrs.item = true
                                        attrs.xs = 6
                                        attrs.style = js {
                                            textAlign = "left"
                                        }

                                        Select {
                                            attrs.defaultValue = state.operation
                                            attrs.autoWidth = true
                                            attrs.disabled = state.started
                                            attrs.onChange = {
                                                it.preventDefault()
                                                setState {
                                                    operation = it.target.asDynamic().value
                                                }
                                            }

                                            MenuItem {
                                                attrs.value = Operation.MULTIPLICATION
                                                +"Multiplication"
                                            }

                                            MenuItem {
                                                attrs.value = Operation.ADDITION
                                                +"Addition"
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
                                        attrs.xs = 6

                                        Typography {
                                            attrs.variant = "h6"
                                            attrs.component = "p"
                                            attrs.align = "right"
                                            +"Table :"
                                        }
                                    }

                                    Grid {
                                        attrs.item = true
                                        attrs.xs = 6
                                        attrs.style = js {
                                            textAlign = "left"
                                        }

                                        Select {
                                            attrs.defaultValue = state.tableNumber
                                            attrs.autoWidth = true
                                            attrs.disabled = state.started
                                            attrs.onChange = {
                                                it.preventDefault()
                                                setState {
                                                    tableNumber = it.target.asDynamic().value
                                                }
                                            }

                                            for (i in 1..10) {
                                                MenuItem {
                                                    attrs.value = i
                                                    +"Table de $i"
                                                }
                                            }
                                            MenuItem {
                                                attrs.value = -1
                                                +"Toutes les tables"
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
                                        attrs.xs = 6

                                        Typography {
                                            attrs.variant = "h6"
                                            attrs.component = "p"
                                            attrs.align = "right"
                                            +"Nombre de questions :"
                                        }
                                    }

                                    Grid {
                                        attrs.item = true
                                        attrs.xs = 6
                                        attrs.style = js {
                                            textAlign = "left"
                                        }

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

                                Button {
                                    attrs.color = "primary"
                                    attrs.variant = "outlined"
                                    attrs.onClick = {
                                        if (!state.started) {
                                            setState {
                                                val newNumbers = getNewNumbers()
                                                number1 = newNumbers.first
                                                number2 = newNumbers.second
                                                result = state.operation.function(number1!!,number2!!)
                                                errorText = ""
                                                resultInput = ""
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
                                            +"${state.number1} ${state.operation.symbol} ${state.number2} = ?"
                                        } else {
                                            +"Prêt ?"
                                        }
                                    } else {
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
                                        attrs.alignItems = "center"
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
//                                                attrs.type = "number"
                                                attrs.value = state.resultInput

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

                                                    val regex = Regex(state.operation.validityPattern)
                                                    if (!regex.matches(valueInput)) {
                                                        setState {
                                                            resultInput = valueInput
                                                            errorText = state.operation.validityError
                                                            checkDisabled = true
                                                        }
                                                    } else if (valueInput.length > 3) {
                                                        setState {
                                                            resultInput = valueInput
                                                            errorText = "Le résultat ne peut pas avoir plus de 3 " +
                                                                    "chiffres"
                                                            checkDisabled = true
                                                        }
                                                    } else {
                                                        setState {
                                                            errorText = ""
                                                            checkDisabled = false
                                                            resultInput = valueInput
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
                                                attrs.disabled = state.checkDisabled || state.resultInput.isEmpty()
                                                attrs.onClick = this@App.checkResult
                                                +"Vérifier"
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    val checkResult = fun(e: Event) {
        e.stopPropagation()

        if (!state.checkDisabled && state.resultInput.isNotEmpty()) {
            // At that step, resultInput is an integer
            if (state.result == state.resultInput.toInt()) {
                val newNumbers = getNewNumbers()
                setState {
                    remainingQuestions--
                    if (!gaveBadAnswer) goodAnswer++
                    gaveBadAnswer = false
                    number1 = newNumbers.first
                    number2 = newNumbers.second
                    result = operation.function(number1!!, number2!!)
                    errorText = ""
                    resultInput = ""
                }
            } else {
                setState {
                    errorText = "$resultInput n'est pas la bonne réponse. Essaie à nouveau."
                    resultInput = ""
                    gaveBadAnswer = true
                }
            }
        }

    }

    val getNewNumbers = fun(): Pair<Int, Int> {
        var newNumber1: Int?
        var newNumber2: Int?
        do {
            newNumber1 = Random.nextInt(1, state.numberMax)
            newNumber2 = if (state.tableNumber == -1) {
                Random.nextInt(1, state.numberMax)
            } else {
                state.tableNumber
            }
        } while (newNumber1 == state.number1 && newNumber2 == state.number2)
        return Pair(newNumber1!!, newNumber2!!)
    }


    companion object {
        const val ROOT_PATH = "/"
        const val LOGIN_PATH = "${ROOT_PATH}login"
    }
}

enum class Operation(
        var function: (Int, Int) -> Int,
        var symbol: String,
        var validityPattern: String,
        var validityError: String) {
    MULTIPLICATION(multiplication, "x", "[0-9]*", "Le résult doit être un nombre entier"),
    ADDITION(addition,"+", "[0-9]*", "Le résult doit être un nombre entier")
}

val multiplication = fun(a: Int, b: Int): Int = a * b

val addition = fun(a: Int, b: Int): Int = a + b

fun RBuilder.app(handler: AppProps.() -> Unit): ReactElement {
    return child(App::class) {
        this.attrs(handler)
    }
}
