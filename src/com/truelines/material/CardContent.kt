@file:JsModule("@material-ui/core/CardContent")
@file:JsNonModule
package com.truelines.material

import react.RClass


external interface CardContentProps: CommonMaterialProps

@JsName("default") // because it was exported as default
external val CardContent : RClass<CardContentProps>
