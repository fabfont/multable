@file:JsModule("@material-ui/core/CardActions")
@file:JsNonModule
package com.truelines.material

import react.RClass


external interface CardActionsProps: CommonMaterialProps {

    /**
     * Default: false
     *
     * Description: If true, the actions do not have additional margin.
     */
    var disableSpacing: Boolean
}

@JsName("default") // because it was exported as default
external val CardActions : RClass<CardActionsProps>
