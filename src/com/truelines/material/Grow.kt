@file:JsModule("@material-ui/core/Grow")
@file:JsNonModule
package com.truelines.material

import react.RClass


external interface GrowProps: CommonMaterialProps {

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
     * Description: If true, show the component; triggers the enter or exit animation.
     */
    var `in`: Boolean

    /**
     * One of:
     * - number
     * - { enter?: number, exit?: number }
     * - 'auto'
     *
     * Default: 'auto'
     *
     * Description: The duration for the transition, in milliseconds.
     * You may specify a single timeout for all transitions, or individually with an object.
     * Set to 'auto' to automatically calculate transition time based on height.
     */
    var timeout: Any
}

@JsName("default") // because it was exported as default
external val Grow : RClass<GrowProps>
