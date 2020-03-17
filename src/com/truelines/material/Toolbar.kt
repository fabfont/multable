@file:JsModule("@material-ui/core/Toolbar")
@file:JsNonModule
package com.truelines.material

import react.RClass


external interface ToolbarProps: CommonMaterialProps {

    /**
     * One of:
     * 'regular'
     * 'dense'
     *
     * Default: 'regular'
     *
     * Description: The variant to use.
     */
    var variant: String

    /**
     * Default: false
     *
     * Description: If true, disables gutter padding.
     */
    var disableGlutters: Boolean

}

@JsName("default") // because it was exported as default
external val Toolbar : RClass<ToolbarProps>
