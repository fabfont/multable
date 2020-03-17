@file:JsModule("@material-ui/core/Select")
@file:JsNonModule
package com.truelines.material


import org.w3c.dom.events.Event
import react.RClass
import react.ReactElement


external interface SelectProps: CommonMaterialProps {

    /**
     * Description: an input element
     */
    var input: dynamic

    /**
     * Description: Attributes applied to the input element. When native is true, the attributes are applied
     * on the select element.
     */
    var inputProps: dynamic

    /**
     * Description: Callback fired when the value is changed.
     */
    var onChange: (Event) -> Unit

    /**
     * Description: selected value
     */
    var value: Any

    /**
     * Default: false
     *
     * Description: whether to use the native element
     */
    var native: Boolean

    /**
     * Description: The selection label
     */
    var labelId: String

    /**
     * Default: false
     *
     * Description: If true, the width of the popover will automatically be set according to the items inside the menu,
     * otherwise it will be at least the width of the select input.
     */
    var autoWidth: Boolean

    /**
     * Description: The default element value. Use when the component is not controlled.
     */
    var defaultValue: Any

    /**
     * One of:
     * - 'standard'
     * - 'outlined'
     * - 'filled'
     *
     * Description: The variant to use
     */
    var variant: String

    var renderValue: (Any) -> ReactElement

    var disabled: Boolean
}

@JsName("default") // because it was exported as default
external val Select : RClass<SelectProps>
