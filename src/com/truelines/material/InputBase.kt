@file:JsModule("@material-ui/core/InputBase")
@file:JsNonModule
package com.truelines.material

import org.w3c.dom.events.Event
import react.RClass


external interface InputBaseProps: CommonMaterialProps {

    /**
     * Description: Attributes applied to the input element.
     */
    var inputProps: dynamic

    /**
     * Description: The short hint displayed in the input before the user enters a value.
     */
    var placeholder: String

    /**
     * Description: The default input element value. Use when the component is not controlled.
     */
    var defaultValue: Any?

    var autoFocus: Boolean

    var onKeyDown: (Event) -> Unit

    var onChange: (Event) -> Unit

    /**
     * Description: The helper text content.
     */
    var helperText: String

    /**
     * Default: false
     *
     * Description: If true, the label will be displayed in an error state.
     */
    var error: Boolean

    /**
     * Possible values:
     * Refer to https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Form_%3Cinput%3E_types
     *
     * Default: text
     *
     * Description: input type
     */
    var type: String
}

@JsName("default") // because it was exported as default
external val InputBase : RClass<InputBaseProps>
