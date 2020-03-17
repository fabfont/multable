@file:JsModule("@material-ui/core/Card")
@file:JsNonModule
package com.truelines.material

import react.RClass


external interface CardProps: CommonMaterialProps {

    /**
     * Default: false
     *
     * Description: If true, the card will use raised styling.
     */
    var raised: Boolean
}

@JsName("default") // because it was exported as default
external val Card : RClass<CardProps>
