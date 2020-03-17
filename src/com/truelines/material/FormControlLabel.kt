
@file:JsModule("@material-ui/core/FormControlLabel")
@file:JsNonModule
package com.truelines.material

import org.w3c.dom.events.Event
import react.RClass
import react.RRef
import react.ReactElement


external interface FormControlLabelProps: CommonMaterialProps {

    /**
     * Description: If true, the component is checked.
     */
    var checked: Boolean

    /**
     * Description: A control element. For instance, it can be be a Radio, a Switch or a Checkbox.
     */
    var control: ReactElement

    /**
     * Default: false
     *
     * Description: If true, the switch will be disabled.
     */
    var disabled: Boolean

    /**
     * Description: Pass a ref to the input element.
     */
    var inputRef: RRef

    /**
     * Description: The text to be used in an enclosing label element.
     */
    var label: String

    /**
     * One of:
     *  - 'end'
     *  - 'start'
     *  - 'top'
     *  - 'bottom
     *
     * Default: 'end'
     *
     * Description: The position of the label.
     */
    var labelPlacement: String


    /**
     * Description: If true, the ripple effect will be disabled.
     */
    var name: String

    /**
     * Description: Callback fired when the state is changed.
     */
    var onChange: (Event) -> Unit

    /**
     * The value of the component. The DOM API casts this to a string.
     */
    var value: Any

}

@JsName("default") // because it was exported as default
external val FormControlLabel : RClass<FormControlLabelProps>
