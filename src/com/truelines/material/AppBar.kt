@file:JsModule("@material-ui/core/AppBar")
@file:JsNonModule
package com.truelines.material

import kotlinext.js.JsObject
import react.RClass


external interface AppBarProps: CommonMaterialProps {

    /**
     * Classes
     */
    var classes: JsObject

    /**
     * One of:
     * 'default'
     * 'inherit'
     * 'primary'
     * 'secondary'
     *
     * Default: 'primary'
     *
     * Description: The color of the component. It supports those theme colors that make sense for this component.
     */
     var color: String

    /**
     * One of:
     * 'absolute'
     * 'fixed'
     * 'relative'
     * 'static'
     * 'sticky'
     *
     * Default: 'fixed'
     *
     * Description: The positioning type. The behavior of the different options is described in the MDN web docs.
     * Note: sticky is not universally supported and will fall back to static when unavailable.
     */
    var position: String
}

@JsName("default") // because it was exported as default
external val AppBar : RClass<AppBarProps>

