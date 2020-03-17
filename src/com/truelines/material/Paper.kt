@file:JsModule("@material-ui/core/Paper")
@file:JsNonModule
package com.truelines.material

import react.RClass


external interface PaperProps: CommonMaterialProps {

    /**
     * Default: 'div'
     *
     * Description: The component used for the root node. Either a string to use a DOM element or a component.
     */
    var component: String

    /**
     * Default: 1
     *
     * Description: Shadow depth, corresponds to dp in the spec. It accepts values between 0 and 24 inclusive.
     */
    var elevation: Int

    /**
     * Default: false
     *
     * Description: If true, rounded corners are disabled.
     */
    var square: Boolean

    /**
     * Default: false
     *
     * Description: If true, disables gutter padding.
     */
    var disableGlutters: Boolean

}

@JsName("default") // because it was exported as default
external val Paper : RClass<PaperProps>
