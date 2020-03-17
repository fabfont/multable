@file:JsModule("@material-ui/core/Divider")
@file:JsNonModule
package com.truelines.material


import react.RClass


external interface DividerProps: CommonMaterialProps {

    /**
     * Default: false
     *
     * Description: Absolutely position the element.
     */
    var absolute: Boolean

    /**
     * Description: Override or extend the styles applied to the component. See CSS API below for more details.
     */
    var classes: dynamic

    /**
     * Default: false
     *
     * Description: If true, the divider will have a lighter color.
     */
    var light: Boolean

    /**
     * One of:
     * - 'horizontal'
     * - 'vertical'
     *
     * Default: 'horizontal
     *
     * Description: The divider orientation.
     */
    var orientation: String

    /**
     * One of:
     * - 'fullWidth'
     * - 'inset'
     * - 'middle'
     *
     * Default: 'fullWidth'
     *
     * Description: The variant to use.
     */
    var variant: String
}

@JsName("default") // because it was exported as default
external val Divider : RClass<DividerProps>

