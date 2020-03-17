@file:JsModule("@material-ui/core/CardActionArea")
@file:JsNonModule
package com.truelines.material

import react.RClass


external interface CardActionAreaProps: ButtonProps

@JsName("default") // because it was exported as default
external val CardActionArea : RClass<CardActionAreaProps>
